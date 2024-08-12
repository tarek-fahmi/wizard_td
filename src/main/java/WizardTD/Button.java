package WizardTD;

import processing.event.MouseEvent;


public class Button implements DrawableElement{
    public App window; // Main application instance
    int x; // X-coordinate of the button's position
    int y; // Y-coordinate of the button's position
    public String type; // Type of the drawable element
    public String label; // Text label displayed on the button
    public Character keybind; // Keyboard key associated with the button
    public int xFinal; // Final X-coordinate after considering button width
    public int yFinal; // Final Y-coordinate after considering button height
    public int fixedCost; // Fixed cost associated with the button, if applicable
    public boolean isClickable; // Flag indicating if the button is clickable
    public boolean isHoverable; // Flag indicating if the button reacts to hover
    public boolean isSelected; // Flag indicating if the button is selected
    public boolean isHovering; // Flag indicating if the mouse is currently hovering over the button
    public boolean buildingTower; // Flag indicating if the button is for building a tower
    public String description; // Description of the button's functionality

    /**
     * Constructor for creating a Button instance.
     *
     * @param window      The main application window the button is part of.
     * @param x           The x-coordinate of the button's position on the screen.
     * @param y           The y-coordinate of the button's position on the screen.
     * @param label       The label text that appears on the button.
     * @param isClickable A flag indicating whether the button is interactive.
     * @param keybind     The keyboard key bound to this button's action.
     */
    public Button(App window, int x, int y, String label, boolean isClickable, Character keybind) {
        this.window = window;
        this.label = label;
        this.x = x;
        this.y = y;
        this.type = "BUTTON";
        this.isSelected = false;
        this.xFinal = x + 50;
        this.yFinal = y + 50;
        this.isClickable = isClickable;
        this.isHovering = false;
        this.buildingTower = false;
        this.keybind = keybind;

        isHoverable = true;
    }

    public int getX(){return this.x;}

    public int getY(){return this.y;}
    public int getXFinal(){return this.xFinal;}
    public int getYFinal(){return this.yFinal;}

    /**
     * Toggles the selected state of the button.
     */


    public boolean getSelected(){return this.isSelected;}

    /**
     * Draws the button on the screen with specified RGB color values.
     *
     * @param r The red component of the button's color.
     * @param g The green component of the button's color.
     * @param b The blue component of the button's color.
     */
    public void drawButton(int r, int g, int b ){

        window.fill(r,g,b);
        window.stroke(0, 0, 0);
        window.rect(this.x, this.y, 50, 50);
        window.fill(0);
        window.textFont(window.mono);
        window.text(this.label, this.x + 5, this.y + 38);
        window.textSize(11);
        window.text(this.description, this.x + 55, this.y + 25);

    }

    public void mouseHovering () {
        if (!this.isSelected && this.isHoverable && !this.isHovering) {
            // Set fill to yellow if mouse is hovering.
            this.isHovering = true;
        }
    }


    public void mouseNotHovering () {
        if (!this.isSelected && this.isHoverable && this.isHovering) {
            // Set fill if mouse is not hovering.
            this.isHovering = false;
        }
    }

    /**
     * Performs the specific functionality associated with this button.
     * This could include pausing the game, fast forwarding, building a tower,
     * upgrading a tower, or casting a spell, based on the label of the button.
     */
    public void performFunctionality (){
        if (!this.keybind.equals('m')){
            if (isSelected){
                isSelected = false;
            } else {
                isSelected = true;
            }
        }
        if (true) {
            if (this.label.equals("FF")) {
                fastForward();
            } else if (this.label.equals("P")) {
                pauseGame();
            } else if (this.label.equals("T")) {
                buildTower();
            } else if (this.label.equals("U1")) {
                upgradeRangePressed();
            } else if (this.label.equals("U2")) {
                upgradeSpeedPressed();
            } else if (this.label.equals("U3")) {
                upgradeDamagePressed();
            } else if (this.label.equals("M")) {
                window.manaPoolSpell.castSpell();
            }
        }

    }


    public void pauseGame(){
        if (this.getSelected()){
            drawButton(255,255,0);
            window.gamePaused = true;
        } else {
            window.gamePaused = false;
        }
    }

    public void loseGame(){
        //Game losing sequence here
    }
    public void fastForward(){
    if (this.getSelected()){
        window.frameRate(window.FPS*2);
        window.fastForward = true;
    } else {
        window.frameRate(window.FPS);
        window.fastForward = false;
    }
    }

    public int getCost(){
        if (this.label.equals("T")){
            return window.config.getTowerCost();
        } else if (this.label.equals("M")){
            return window.manaPoolSpell.getSpellCost();
        } else {
            return 0;
        }
    }

    public void buildTower(){
        if (this.getSelected()){
            window.buildingTower = true;
        } else {
            window.buildingTower = false;
        }
    }

    public void upgradeRangePressed(){
        if (this.getSelected()){
            window.upgradingTowerRange = true;
        } else {
            window.upgradingTowerRange = false;
        }
    }

    public void upgradeDamagePressed(){
        if (this.getSelected()){
            window.upgradingTowerDamage = true;
        } else {
            window.upgradingTowerDamage = false;
        }
    }

    public void upgradeSpeedPressed(){
        if (this.getSelected()){
            window.upgradingTowerSpeed = true;
        } else {
            window.upgradingTowerSpeed = false;
        }
    }

    /**
     * Draws the button on the screen, updating its appearance based on its state.
     */
    public void draw(){
        if (this.label.equals("FF")) {
            this.description = "2x speed";
        } else if (this.label.equals("P")) {
            this.description = "PAUSE";
        } else if (this.label.equals("T")) {
            this.description = "Build\ntower";
            this.fixedCost = window.config.getTowerCost();
        } else if (this.label.equals("U1")) {
            this.description = "Upgrade\nrange";
        } else if (this.label.equals("U2")) {
            this.description = "Upgrade\nspeed";
        } else if (this.label.equals("U3")){
            this.description = "Upgrade\ndamage";
        } else if (this.label.equals("M")){
            this.fixedCost = window.manaPoolSpell.getSpellCost();
            this.description = ("Mana pool\ncost: " + getCost());

        }
        if (this.isSelected){
            drawButton(255,255,0);
        } else if (this.isHovering){
            drawButton(128, 128, 128);
            if (this.label.equals("T") || this.label.equals("M")){
                window.pushStyle();
                window.pushMatrix();

                window.stroke(0);
                window.strokeWeight(1);
                window.fill(255);

                window.rect(this.x - 55, this.y + 5, 50, 20);
                window.fill(0);
                window.textSize(10);
                window.text("Cost: " + this.getCost(), this.x - 50, this.y + 20);

                window.popMatrix();
                window.popStyle();
            }
        } else{
            drawButton(136, 116, 76);
        }


    }


}