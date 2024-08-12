package WizardTD;

/**
 * Represents a Tower in the game which can attack monsters.
 * It inherits from the Tile class as it occupies a tile on the game board.
 */
public class Tower extends Tile {
    // Attributes with Javadoc comments
    /** Damage that the tower can inflict on a monster. */
    public int towerDamage;
    /** Range within which the tower can attack monsters. */
    public int towerRange;
    /** Current level of range upgrades for the tower. */
    public int rangeLevel;
    /** Current level of damage upgrades for the tower. */
    public int damageLevel;
    /** Current level of firing speed upgrades for the tower. */
    public int speedLevel;
    /** Overall level of the tower, based on upgrades. */
    public int towerLevel;
    /** Timestamp of the last shot fired by the tower. */
    public float lastShotTime;
    /** Firing speed of the tower. Lower values mean faster shooting. */
    public float towerFiringSpeed;
    /** Flag indicating if the mouse is hovering over this tower. */
    public boolean mouseHovering = false;
    /** Flag that enables the tower to shoot. */
    public boolean allowedToShoot = true;
    /** Interpreter to read configuration settings for the tower from a JSON file. */
    public JSONInterpreter config = new JSONInterpreter("config.json");

    /**
     * Constructor to create a new Tower instance.
     * Initializes the tower with attributes from configuration and sets up its initial state.
     *
     * @param window The main application window where the game is rendered.
     * @param x The x-coordinate of the tower on the game board (in pixels).
     * @param y The y-coordinate of the tower on the game board (in pixels).
     */
    public Tower(App window, int x, int y) {

        super(window, x, y, "TOWER", true);
        this.sprite = window.sprites.get("towerSprite");
        this.towerDamage = config.getInitialTowerDamage();
        this.towerRange = config.getInitialTowerRange();
        this.towerFiringSpeed = (float) config.getInitialTowerSpeed();
        this.lastShotTime = window.currentTime;
        this.rangeLevel = 0;
        this.damageLevel = 0;
        this.speedLevel = 0;

        this.type = "TOWER";
    }

    /**
     * Calculates the cost to upgrade the range of the tower.
     *
     * @return The calculated cost to upgrade the range.
     */
    public int rangeUpgradeCost(){
        return (this.rangeLevel+ 1) * 10;
    }


    /**
     * Calculates the cost to upgrade the firing speed of the tower.
     *
     * @return The calculated cost to upgrade the firing speed.
     */
    public int speedUpgradeCost(){
        return (this.speedLevel + 1) * 10;
    }

    /**
     * Calculates the cost to upgrade the damage of the tower.
     *
     * @return The calculated cost to upgrade the damage.
     */
    public int damageUpgradeCost(){
        return (this.damageLevel + 1) * 10;
    }


    /**
     * Upgrades the range of the tower if the player has enough mana.
     */
    public void upgradeRange() {
        int upgradeCost = rangeUpgradeCost();

        if (window.spendMana(upgradeCost)){
            this.rangeLevel += 1;
            this.towerRange += window.CELLSIZE;
            updateTowerSprite();
        }
    }


    /**
     * Upgrades the firing speed of the tower if the player has enough mana.
     */
    public void upgradeSpeed(){
        int upgradeCost = speedUpgradeCost();

        if (window.spendMana(upgradeCost)){
            this.speedLevel += 1;

            if (this.towerFiringSpeed - 0.5 > 0){
                this.towerFiringSpeed -= 0.5;
            } else {
                this.towerFiringSpeed = 0.2500F;
            }

            updateTowerSprite();
        }
    }

    /**
     * Upgrades the damage of the tower if the player has enough mana.
     */
    public void upgradeDamage(){
        int upgradeCost = damageUpgradeCost();

        if (window.spendMana(upgradeCost)){
            this.damageLevel += 1;
            this.towerDamage += (config.getInitialTowerDamage() / 0.5);
            updateTowerSprite();
        }
    }

    /**
     * Updates the tower's sprite based on its upgrade levels.
     */
    public void updateTowerSprite(){
        if (this.rangeLevel >= 2 && this.speedLevel >= 2 && this.damageLevel >= 2){
            this.towerLevel = 2;
            this.sprite = window.sprites.get("towerSprite2");;
        } else if (this.rangeLevel >= 1 && this.speedLevel >= 1 && this.damageLevel >= 1) {
            this.towerLevel = 1;
            this.sprite = window.sprites.get("towerSprite1");;
        }
    }

    /**
     * Draws the speed indicator on the tower's sprite.
     */
    public void drawSpeedIndicator(){

            if (this.speedLevel > 0 && this.speedLevel > this.towerLevel) {
            window.pushMatrix();
            window.pushStyle();

            window.stroke(73, 216, 230);
            window.noFill();
            window.strokeWeight(speedLevel);
            window.rect(this.x + 6, (this.y + 6), 20,20);

            window.popMatrix();
            window.popStyle();
        }
    }

    /**
     * Draws the damage indicator on the tower's sprite.
     */
    public void drawDamageIndicator(){

        if (this.damageLevel > 0 && this.damageLevel > this.towerLevel){
            for (int i = 0; i < damageLevel; i++) {
                window.pushMatrix();
                window.pushStyle();

                window.fill(255,0,255);
                window.noStroke();
                window.textFont(window.mono);
                window.textSize(12);
                window.text("x", this.x + i * 8, this.y + 29);

                window.popMatrix();
                window.popStyle();
            }
        }
    }


    /**
     * Draws the range indicator on the tower's sprite.
     */
    public void drawRangeIndicator(){

        if (this.rangeLevel > 0 && this.towerLevel <
                this.rangeLevel){
            for (int i = 0; i < rangeLevel; i++){
                if (this.x + i*7 < 640) {
                    window.pushMatrix();
                    window.pushStyle();

                    window.stroke(255, 0, 255);
                    window.strokeWeight(1);
                    window.noFill();
                    window.ellipse(this.x + 3 + (8 * i), this.y + 3, 5, 5);

                    window.popMatrix();
                    window.popStyle();
                }
            }
        }
    }

    /**
     * Retrieves the current attack range of the tower.
     *
     * @return The tower's range.
     */

    public int getTowerRange(){return this.towerRange;}

    /**
     * Retrieves the current damage the tower can inflict.
     *
     * @return The tower's damage.
     */
    public int getTowerDamage(){return this.towerDamage;}

    /**
     * Retrieves the current firing speed of the tower.
     *
     * @return The tower's firing speed.
     */

    public double getTowerFiringSpeed(){return this.towerFiringSpeed;}

    /**
     * Retrieves the x-coordinate of the center of the tower.
     *
     * @return The x-coordinate of the tower's center.
     */
    public float getTowerCenterX(){return this.x + this.sprite.width / 2;}

    /**
     * Retrieves the y-coordinate of the center of the tower.
     *
     * @return The y-coordinate of the tower's center.
     */
    public float getTowerCenterY(){return this.y + this.sprite.height / 2;}

    /**
     * Draws the indicators for the tower's current upgrades.
     */
    public void drawIndicators(){
        drawSpeedIndicator();
        drawDamageIndicator();
        drawRangeIndicator();
    }

    /**
     * Draws the tower on the game board.
     */
    @Override
    public void draw(){
        // Handles graphics (should only be a line or 2)
        window.image(this.sprite, this.x, this.y);
    }

    /**
     * Calculates the displacement between the tower and a given monster.
     *
     * @param monster The monster to calculate the displacement to.
     * @return The calculated displacement.
     */
    public int displacement(Monster monster){

        return (int) Math.floor(Math.sqrt(Math.pow(this.getTowerCenterX() - monster.getXCenter(), 2) +
                Math.pow(this.getTowerCenterY() - monster.getYCenter(), 2)));
    }

    /**
     * Attempts to shoot at a monster if the tower is ready to fire.
     *
     * @param monster The monster to shoot at.
     */
    public void attemptToShoot(Monster monster) {
        // This method attempts to shoot if the tower is ready.
        if (window.currentTime - this.lastShotTime >= this.towerFiringSpeed) {
            System.out.println("firerate: " + (window.currentTime - this.lastShotTime) + " should be: " + (this.towerFiringSpeed));
            this.shoot(monster);
        }
    }


    /**
     * Handles the shooting mechanism of the tower at a given monster.
     *
     * @param monster The monster to be shot at.
     */

    public void shoot(Monster monster) {
        // When a shot is fired, update the lastShotTime to the current time.
        this.lastShotTime = window.currentTime;
        window.fireballs.add(new Fireball(window, monster, this));
    }



}