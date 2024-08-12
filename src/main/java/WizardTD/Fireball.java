package WizardTD;

import processing.core.PImage;

/**
 * The Fireball class represents a projectile fired by a tower at a monster in the game.
 */

public class Fireball implements MovingElement{
    private PImage sprite; // The image of the fireball
    private App window; // The main application window where the game is rendered
    private Monster monster; // The monster that the fireball is aimed at
    private Tower tower; // The tower that fired the fireball
    private int x; // The coordinates of the fireball
    public int y; // The coordinates of the fireball
    public int speed; // The speed at which the fireball travels
    public boolean pursuing = true; // Whether the fireball is in pursuit of a monster


    /**
     * Constructor for creating a Fireball object.
     *
     * @param window  The main application window where the game is rendered.
     * @param monster The target monster that the fireball is aimed at.
     * @param tower   The tower from which the fireball is fired.
     */
    public Fireball(App window, Monster monster, Tower tower){
        this.window = window;
        this.sprite = window.sprites.get("fireball");
        this.monster = monster;
        this.tower = tower;
        this.speed = 5;
        this.x = (int) tower.getTowerCenterX();
        this.y = (int) tower.getTowerCenterY();
    }

    /**
     * Moves the fireball towards the targeted monster.
     */
    @Override
    public void move(int x, int y) {
        // Calculate the direction vector from Fireball to Monster
        float dx = x - this.x;
        float dy = y - this.y;

        // Calculate the magnitude of the direction vector
        float magnitude = (float) Math.sqrt(dx * dx + dy * dy);

        // Normalize the direction vector
        if (magnitude > 0) {
            dx /= magnitude;
            dy /= magnitude;
        }
        // Move the Fireball by multiplying the normalized direction by the desired speed
        this.x += dx * this.speed;
        this.y += dy * this.speed;
    }

    /**
     * Calculates and returns the displacement between the fireball and the monster.
     *
     * @return The distance from the fireball to the monster's center.
     */
    private int displacement(){
        return (int) Math.floor(Math.sqrt(Math.pow(this.x + 3 - this.monster.getXCenter(), 2) +
                Math.pow(this.y + 3 - this.monster.getYCenter(), 2)));
    }

    /**
     * Draws the fireball on the window if it is in pursuit of a monster.
     */
    public void draw(){
        if (this.pursuing){
            tick();
            window.image(this.sprite, this.x, this.y);
        }
    }



    /**
     * Updates the fireball's position and checks if it has hit the monster.
     */
    public void tick(){
        move((int) monster.getXCenter(), (int) monster.
                getYCenter());
        checkHitMonster();
    }

    /**
     * Checks if the fireball has hit the monster and applies damage if it has.
     */
    private void checkHitMonster() {
        if (displacement() <= 5) {

            this.pursuing = false;
            this.monster.damageMonster(tower.getTowerDamage());
        }
    }
}
