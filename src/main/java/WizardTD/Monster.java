package WizardTD;

import processing.core.PImage;

import java.util.ArrayList;
import java.util.Random;

/**
 * The {@code Monster} class represents an enemy with various attributes and behaviors in the game.
 * It can move along a path, take damage, and provide mana upon being killed.
 */
public class Monster implements MovingElement{
    public int hp; // Current health points of the monster.
    public double speed; // Movement speed of the monster.
    public int x; // Current x-coordinate of the monster on the game map.
    public int y; // Current y-coordinate of the monster on the game map.
    private int frameSkipCounter = 0; // Counter to skip frames for animations.
    private final int frameSkipThreshold = 5; // Number of frames to skip for animations.

    private int xDestination; // X-coordinate of the destination position for the monster to move to.
    private int yDestination; // Y-coordinate of the destination position for the monster to move to.
    private int pathLeg; // Index of the current leg in the path the monster is following.
    public int initialHP; // Initial health points of the monster for reference.

    public int mana_gained_on_kill; // Amount of mana gained by the player upon killing this monster.
    public int deathFrame = 1; // Current frame of the death animation.
    public int drawCallCounter = 0; // Counter for the draw calls to manage animations.
    public boolean atDestination; // Flag indicating if the monster has reached its destination.
    public boolean alive; // Flag indicating if the monster is alive.
    public boolean spawned; // Flag indicating if the monster has been spawned in the game.
    private boolean manaAwarded = false; // Flag to ensure mana is only awarded once upon death.
    private boolean drawing = true; // Flag controlling if the monster should be drawn.
    public boolean respawned = false; // Flag indicating if the monster has respawned.
    public Random random = new Random(); // Random generator for various randomizations.
    public float spawnTime; // Game time at which the monster spawned.
    public double damageMultiplier; // Multiplier for incoming damage based on the monster's armor.
    public PImage sprite; // Image sprite representing the monster.
    public App window; // The game window that contains this monster.
    public String type; // Type identifier for the monster.
    public Tile spawn; // Tile where the monster spawns.
    public JSONInterpreter config; // Configuration interpreter for the game.

    public ArrayList<Tile> spawnPoints; // List of potential spawn points for the monster.
    public ArrayList<Tile> destinations; // List of tiles representing the monster's destination path.

    /**
     * Constructor for creating a new Monster.
     *
     * @param window              Reference to the main game window.
     * @param hp                  Health points of the monster.
     * @param speed               Speed at which the monster moves.
     * @param armour              Armour of the monster which reduces incoming damage.
     * @param mana_gained_on_kill Amount of mana the player gains upon killing this monster.
     * @param type                The type of monster.
     */
    public Monster(App window, int hp, double speed, double armour, int mana_gained_on_kill, String type){

        this.initialHP = hp;
        this.hp = hp;
        this.speed = speed;

        this.damageMultiplier = 1 - armour;
        this.mana_gained_on_kill = mana_gained_on_kill;
        this.type = type;
        this.alive = true;

        this.window = window;
        this.config = window.config;
        this.spawned = false;
    }

    /**
     * Filters and returns spawn points from a list of tiles.
     *
     * @param tilesList List of all tiles to search for spawn points.
     * @return An ArrayList of Tile objects that are designated spawn points.
     */
    public ArrayList<Tile> returnSpawnPoints(ArrayList<Tile> tilesList) {
        ArrayList<Tile> allSpawnPoints = new ArrayList<>();

        for (Tile tile : tilesList) {
            if ((tile.getR() == 0 || tile.getR() == 19 || tile.getC()  == 0
                    || tile.getC() == 19) && (tile.type.equals("PATH"))){
                allSpawnPoints.add(tile);
            }
        }
        return allSpawnPoints;
    }

    /**
     * Moves the monster towards the specified final position.
     *
     * @param xFinal The x-coordinate of the final position to move towards.
     * @param yFinal The y-coordinate of the final position to move towards.
     */
    @Override
    public void move(int xFinal, int yFinal) {
        if (respawned){
            this.spawnTime = window.currentTime;
        }
        if (this.x < xFinal) {
            this.x += this.speed;
            if (this.x > xFinal) {
                this.x = xFinal; // Ensure the monster doesn't overshoot the target
            }
        } else if (this.x > xFinal) {
            this.x -= this.speed;
            if (this.x < xFinal) {
                this.x = xFinal;
            }
        }

        if (this.y < yFinal) {
            this.y += this.speed;
            if (this.y > yFinal) {
                this.y = yFinal;
            }
        } else if (this.y > yFinal) {
            this.y -= this.speed;
            if (this.y < yFinal) {
                this.y = yFinal;
            }
        }

        if (this.x == xFinal && this.y == yFinal) {
            this.atDestination = true;
        }
        if (respawned){
            this.spawnTime = window.currentTime;
        }
    }

    /**
     * Handles the navigation of the monster along its path.
     */
    public void navigate() {
        Tile nextTile = spawn.viablePath.get(pathLeg);
        if ((this.atDestination || this.pathLeg == 0) && this.pathLeg < (spawn.viablePath.size() - 1)){
            this.pathLeg++;
            this.setDestination(nextTile.getX(), nextTile.getY());
            this.atDestination = false;
        } else if (this.pathLeg == (spawn.viablePath.size() - 1)){
            this.atDestination = true;
            this.setDestination(nextTile.getX() + 8, nextTile.getY() + 8);
        }

    }
    /**
     * Spawns the monster at a random spawn point and initializes its path.
     */
    public void spawn(){
        if (!this.spawned){
            this.spawnPoints = returnSpawnPoints(window.tiles);
            int randomIndex = random.nextInt(this.spawnPoints.size());

            this.spawn = this.spawnPoints.get(randomIndex);
            this.sprite = window.sprites.get("monsterSprite");

            goToSpawn();

            this.pathLeg = 0;
            this.atDestination = true; // Initialize atDestination to true so that navigate will set the first destination

            this.destinations = spawn.viablePath;
            this.spawnTime = window.currentTime;
            this.spawned = true;
        }
    }

    /**
     * Returns the monster to spawn.
     */
    private void goToSpawn() {
        if (this.spawn.getR() == 0){
            this.x = spawn.getX() + 6;
            this.y = spawn.getY() + -24;
        } else if (this.spawn.getC() == 0) {
            this.x = spawn.getX()  - 24;
            this.y = spawn.getY() + 6;
        } else if (this.spawn.getR() == 19){
            this.x = spawn.getX() + 6;
            this.y = spawn.getY() + 38;
        } else if (this.spawn.getR() == 19){
            this.x = spawn.getX() + 38;
            this.y = spawn.getY() + 6;
        }
    }


    /**
     * Sets the destination coordinates for the monster to move towards.
     *
     * @param x The x-coordinate of the destination.
     * @param y The y-coordinate of the destination.
     */
    public void setDestination(int x, int y){
        this.xDestination = x + 6;
        this.yDestination = y + 6;
    }

    /**
     * Updates the monster's state every game tick.
     */
    public void tick() {
        this.navigate();
        this.move(this.xDestination, this.yDestination);

        int finalX = this.destinations.get(destinations.size() - 1).getX() + 14;
        int finalY = this.destinations.get(destinations.size() - 1).getY() + 14;

        if (this.x == finalX && this.y == finalY && this.alive) {
            this.theZombiesAteYourBrains();
        }
    }

    /**
     * Handles the drawing of the monster on the game window.
     */
    public void draw() {
        // Increment frame skip counter and check if it's the fifth frame
        if (++frameSkipCounter >= frameSkipThreshold) {
            frameSkipCounter = 0; // Reset the counter

            //Only iterate deathframe every 5 frames so that it isnt too fast
            if (this.spawned && this.hp <= 0) {
                this.alive = false;
                if (this.deathFrame < 5) {
                    this.sprite = window.sprites.get("monsterSprite" + this.deathFrame);
                    this.deathFrame += 1;

                    if (this.deathFrame == 5) {
                        this.drawing = false;
                        window.newMonsterDead = true;
                        this.alive = false;
                    }
                }
            }
        }

        // Perform the draw operations that should happen every frame
        if (this.spawned) {
            if (this.drawing) {
                if (alive) {
                    tick();
                    drawHPBar();
                }
                window.image(this.sprite, this.x, this.y);
            } else {
            }

        }


    }

    /**
     * Awards mana to the player when the monster is killed.
     */
    public void killMonster(){
        if (!manaAwarded) { // Check if mana has already been awarded
            window.gainMana(this.mana_gained_on_kill);
            manaAwarded = true; // Set the flag so mana is not awarded again
        }
    }

    /**
     * Inflicts damage on the monster and handles its death if health reaches zero.
     *
     * @param damage The amount of damage to inflict.
     */
    public void damageMonster(int damage) {
        // Calculate the effective damage based on the damage multiplier
        int effectiveDamage = (int)(damage * damageMultiplier);
        this.hp = Math.max(this.hp - effectiveDamage, 0); // Ensure HP doesn't go below zero

        //If the monster has died, set alive to false and call killMonster
        if (this.hp <= 0 && this.alive) {
            this.killMonster(); // Call killMonster here to award mana once upon death
        }
    }

    /**
     * Triggers the end-of-game condition when the monster reaches the player's base.
     */
    public void theZombiesAteYourBrains(){

        //If the monster causes the player to hit 0 mana
        if (window.currentMana - this.hp <= 0){
            //Lose game screen
            window.currentMana = 0;
            window.gameLost = true;
        } else {
            //Monster damages player by remaining hp
            window.currentMana -= this.hp;

            goToSpawn();
            this.pathLeg = 0;
            this.atDestination = true;
            this.respawned = true;
        }
        //Despawn monster
    }

    /**
     * Draws the health bar of the monster above its sprite.
     */
    public void drawHPBar() {
        window.pushStyle();
        window.rectMode(window.CORNER);

        float barX = this.x - 5;
        float barY = this.y - 8;

        //Dimensions for HP bar
        float barWidth = 30;
        float barHeight = 4;

        // Draw green bar at hp/maxHP width
        window.fill(255, 0, 0);
        window.rect(barX, barY, barWidth, barHeight);

        float damageBarWidth = ((float) this.hp / (float) this.initialHP) * barWidth;
        window.fill(0, 255, 0);
        window.rect(barX, barY, damageBarWidth, barHeight);

        window.popStyle();
    }

    /**
     * Gets the center x-coordinate of the monster's sprite.
     *
     * @return The center x-coordinate of the sprite.
     */
    public float getXCenter(){return (float) this.x + (this.sprite.width/2);}

    /**
     * Gets the center y-coordinate of the monster's sprite.
     *
     * @return The center y-coordinate of the sprite.
     */
    public float getYCenter(){return (float) this.y + (this.sprite.height/2);}
}

