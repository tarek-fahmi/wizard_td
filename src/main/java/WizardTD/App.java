package WizardTD;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import processing.event.MouseEvent;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class
App extends PApplet {

    /** The size of each individual cell in the game grid, in pixels. */
    public static final int CELLSIZE = 32;

    /** The width allocated for the sidebar on the game window, in pixels. */
    private static final int SIDEBAR = 200;

    /** The height allocated for the top bar on the game window, in pixels. */
    public static final int TOPBAR = 40;

    /** The width of the game board, measured in the number of cells. */
    public static final int BOARD_WIDTH = 20;

    /** The total width of the application window, calculated by adding the sidebar width to the board width. */
    public static int WIDTH = BOARD_WIDTH * CELLSIZE + SIDEBAR;

    /** The total height of the application window, calculated by adding the top bar height to the board height. */
    private static int HEIGHT = BOARD_WIDTH * CELLSIZE + TOPBAR;

    /** The frames per second at which the game is set to run. */
    public static final int FPS = 60;

    /** Path to the configuration file that contains game settings and parameters. */
    public String configPath = "config.json";

    /** A mapping from descriptive string keys to PImage objects representing all of the sprites used in the game. */
    public HashMap<String, PImage> sprites = new HashMap<>();

    /** Button object for activating fast forward mode. */
    public Button ffButton;

    /** A boolean flag to determine if the game is currently in fast forward mode. */
    public boolean fastForward;
    public boolean gameRestarting;

    /** A boolean flag to determine if the game is currently on the last wave. */
    public boolean lastWave;

    /** Button object for pausing the game. */
    public Button pauseButton;

    /** Button object for placing a new tower on the game board. */
    public Button towerButton;

    /** Button object for upgrading a tower's range. */
    public Button upgradeRangeButton;

    /** Button object for upgrading a tower's firing speed. */
    public Button upgradeSpeedButton;

    /** Button object for upgrading a tower's damage output. */
    public Button upgradeDamageButton;

    /** Button object for activating the mana pool ability. */
    public Button manaPoolButton;

    /** The font used for rendering text in monospace. */
    public PFont mono;

    /** The mana bar object representing the player's current mana. */
    public ManaBar manaBar;

    /** The index of the currently selected wizard in the wizard selection array or list. */
    public int wizardIndex;
    public int currentLevel = 1;


    /** The x-coordinate of the tile where the player wants to build a tower. */
    public int towerX;

    /** The y-coordinate of the tile where the player wants to build a tower. */
    public int towerY;

    /** Stores the current game time, which can be used for various timed events. */
    public float currentTime;

    /** Stores the number of frames since the last recorded event or action. */

    public float winTime;
    public int previousFrameCount;

    /** The range within which a tower can attack, measured in cells. */
    public int towerRange;

    /** A boolean flag to determine if the player is currently in the process of building a tower. */
    public boolean buildingTower;

    /** A boolean flag to check if the game is currently paused. */
    public boolean gamePaused;

    /** A boolean flag to determine if the player is upgrading a tower's damage. */
    public boolean upgradingTowerDamage;

    /** A boolean flag to determine if the player is upgrading a tower's firing speed. */
    public boolean upgradingTowerSpeed;

    /** A boolean flag to determine if the player is upgrading a tower's range. */
    public boolean upgradingTowerRange;

    /** Indicates whether a tower is being hovered over by the mouse pointer. */
    public boolean towerHovering;

    /** A boolean flag to indicate that a new monster has been killed. */
    public boolean newMonsterDead;

    /** A boolean flag to check if the game has been lost. */
    public boolean gameLost;

    /** A boolean flag to check if the game has been won. */
    public boolean gameWon;

    /** A test monster object for debugging or testing game functionalities. */
    public Monster testMonster;
    /** The mana pool spell object, which represents a special ability or power-up. */
    public ManaPool manaPoolSpell;

// Data objects:

    /** A list of all the tiles on the game board. */
    public ArrayList<Tile> tiles = new ArrayList<>();

    /** A list of all the buttons in the game. */
    public ArrayList<Button> buttons = new ArrayList<>();

    /** A list of all drawable elements in the game that need to be rendered each frame. */
    public ArrayList<DrawableElement> drawables = new ArrayList<>();

    /** A list of all monsters currently in the game. */
    public ArrayList<Monster> monsters = new ArrayList<>();

    /** A list of all towers currently placed in the game. */
    public ArrayList<Tower> towers = new ArrayList<>();

    /** A list of all fireballs that have been shot and are currently in motion. */
    public ArrayList<Fireball> fireballs = new ArrayList<>();

    /** A two-dimensional array representing the tiles of the game board as characters. */
    public String[][] tilesAsChars = new String[BOARD_WIDTH][BOARD_WIDTH];

    /** A two-dimensional array of tile objects representing the layout of the game board. */
    public Tile[][] tilesLayout = new Tile[BOARD_WIDTH][BOARD_WIDTH];

    /** An object that interprets the game configuration from a JSON file. */
    public JSONInterpreter config;

    /** The current level object which contains the game logic for the current stage or level. */
    public Level level;

    /** The maximum amount of mana the player can hold. */
    public float maxMana;

    /** The current amount of mana the player has, which can be used to cast spells or place towers. */
    public float currentMana;

    /** The wizard object representing the player's avatar or character in the game. */
    public Wizard wizard;

    /** An object that handles pathfinding for the game using the Breadth-First Search algorithm. */
    public BSFNavigator pathFinder;

    // Feel free to add any additional methods or attributes you want. Please put classes in different files.

    public App() {
        this.configPath = "config.json";
    }
    /**
     * Initialise the setting of the window size.
     */
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    /**
     * Load all resources such as images. Initialise the elements such as the player, enemies and map elements.
     */

    @Override
    public void setup() {
        frameRate(FPS);
        fill(0);
        config = new JSONInterpreter(configPath);
        maxMana = config.getInitialManaCap();
        currentMana = config.getInitialMana();
        manaBar = new ManaBar(this);
        mono = createFont("src/main/resources/WizardTD/Roboto-Regular.ttf", 35);

        gameLost = false;
        gameWon = false;
        gamePaused = false;
        fastForward = false;
        gameRestarting = false;
        upgradingTowerDamage = false;
        upgradingTowerRange = false;
        upgradingTowerSpeed = false;
        buildingTower = false;
        towerHovering = false;
        newMonsterDead = false;


        sprites.put("monsterSprite", loadImage("src/main/resources/WizardTD/gremlin.png"));
        sprites.put("monsterSprite1", loadImage("src/main/resources/WizardTD/gremlin1.png"));
        sprites.put("monsterSprite2", loadImage("src/main/resources/WizardTD/gremlin2.png"));
        sprites.put("monsterSprite3", loadImage("src/main/resources/WizardTD/gremlin3.png"));
        sprites.put("monsterSprite4", loadImage("src/main/resources/WizardTD/gremlin4.png"));
        sprites.put("grassSprite", loadImage("src/main/resources/WizardTD/grass.png"));
        sprites.put("shrubSprite", loadImage("src/main/resources/WizardTD/shrub.png"));
        sprites.put("horizontalPathSprite", loadImage("src/main/resources/WizardTD/path0.png"));
        sprites.put("swPathSprite", loadImage("src/main/resources/WizardTD/path1.png"));
        sprites.put("swePathSprite", loadImage("src/main/resources/WizardTD/path2.png"));
        sprites.put("nswePathSprite", loadImage("src/main/resources/WizardTD/path3.png"));
        sprites.put("verticalPathSprite", rotateImageByDegrees(sprites.get("horizontalPathSprite"),90));
        sprites.put("nwPathSprite", rotateImageByDegrees(sprites.get("swPathSprite"), 90));
        sprites.put("nePathSprite", rotateImageByDegrees(sprites.get("swPathSprite"), 180));
        sprites.put("sePathSprite", rotateImageByDegrees(sprites.get("swPathSprite"), 270));
        sprites.put("nsePathSprite", rotateImageByDegrees(sprites.get("swePathSprite"), 90));
        sprites.put("nwePathSprite", rotateImageByDegrees(sprites.get("swePathSprite"), 180));
        sprites.put("nswPathSprite", rotateImageByDegrees(sprites.get("swePathSprite"), 270));
        sprites.put("wizardSprite", loadImage("src/main/resources/WizardTD/wizard_house.png"));
        sprites.put("towerSprite", loadImage("src/main/resources/WizardTD/tower0.png"));
        sprites.put("towerSprite1", loadImage("src/main/resources/WizardTD/tower1.png"));
        sprites.put("towerSprite2", loadImage("src/main/resources/WizardTD/tower2.png"));
        sprites.put("fireball", loadImage("src/main/resources/WizardTD/fireball.png"));
        sprites.put("error", loadImage("src/main/resources/WizardTD/error.png"));


        manaPoolSpell = new ManaPool(this);
        createButtons();
        this.tilesAsChars = findTilesFromFile(config.getLevelLayout());
        createTiles(tilesAsChars);

        monsters.add(new Monster(this, 100, 1, 1, 1, "Gremlin"));
        generateSpawnPaths();
        monsters.remove(0);

        this.level = new Level(this, this.config);
    }

    public void restart(){
        gameLost = false;
        gameWon = false;
        gamePaused = false;
        fastForward = false;
        gameRestarting = false;
        upgradingTowerDamage = false;
        upgradingTowerRange = false;
        upgradingTowerSpeed = false;
        buildingTower = false;
        towerHovering = false;
        newMonsterDead = false;

        tiles.clear();
        drawables.clear();
        level.waves.get(level.currentWave).spawnedMonsters.clear();
        monsters.clear();
        towers.clear();
        fireballs.clear();
        buttons.clear();

        frameRate(FPS);
        fill(0);
        config = new JSONInterpreter(configPath);
        maxMana = config.getInitialManaCap();
        currentMana = config.getInitialMana();
        manaBar = new ManaBar(this);
        mono = createFont("src/main/resources/WizardTD/Roboto-Regular.ttf", 35);

        manaPoolSpell = new ManaPool(this);
        this.tilesAsChars = findTilesFromFile(config.getLevelLayout());
        createTiles(tilesAsChars);

        monsters.add(new Monster(this, 100, 1, 1, 1, "Gremlin"));
        generateSpawnPaths();
        monsters.remove(0);

        this.level = new Level(this, this.config);
        createButtons();
        loop();

        for (Button button : buttons){
            button.isSelected = false;
        }

    }

    public void proceedNextLevel(){
        currentLevel++;

        gameLost = false;
        gameWon = false;
        gamePaused = false;
        fastForward = false;
        gameRestarting = false;
        upgradingTowerDamage = false;
        upgradingTowerRange = false;
        upgradingTowerSpeed = false;
        buildingTower = false;
        towerHovering = false;
        newMonsterDead = false;

        tiles.clear();
        drawables.clear();
        monsters.clear();
        towers.clear();
        fireballs.clear();
        buttons.clear();

        for (Button button : buttons){
            button.isSelected = false;
        }

        frameRate(FPS);
        fill(0);
        config = new JSONInterpreter(configPath);
        maxMana = config.getInitialManaCap();
        currentMana = config.getInitialMana();
        manaBar = new ManaBar(this);
        mono = createFont("src/main/resources/WizardTD/Roboto-Regular.ttf", 35);

        manaPoolSpell = new ManaPool(this);
        this.tilesAsChars = findTilesFromFile("level" + currentLevel + ".txt");
        createTiles(tilesAsChars);

        monsters.add(new Monster(this, 100, 1, 1, 1, "Gremlin"));
        generateSpawnPaths();
        monsters.remove(0);

        this.level = new Level(this, this.config);
        createButtons();
        loop();
    }


    // Config loading methods

    /**
     * Input - eg. "level1.txt" file
     * What to do - read through input and make a 2D array of the file character seperated.
     * Output - A 2 dimensional array of 1 char strings which represent the tiles.
     */

    public String[][] findTilesFromFile(String levelLayoutName) {

        File f = new File(levelLayoutName);
        String[][] levelLayout = new String[BOARD_WIDTH][BOARD_WIDTH];

        try{
            Scanner scan = new Scanner(f);
            int i = 0;
            while (i < BOARD_WIDTH) {
                String currentLine =  scan.nextLine();
                while(currentLine.length() < BOARD_WIDTH){
                    currentLine += " ";
                }
                levelLayout[i] = currentLine.split("");
                ++i;
            }
            return levelLayout;
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
            return null;
        }
    }
    /**
     * Input - eg. "level1.txt" file
     * What to do - read through input and make a 2D array of the file character seperated
     */

    public void createTiles(String[][] tilesAsChars) {
        tiles.clear();

        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                if (tilesAsChars[i][j].equals(" ")) {
                    tilesLayout[i][j] = new Grass(this, j * CELLSIZE, 40 + i * CELLSIZE);
                }
                if (tilesAsChars[i][j].equals("X")) {
                    tilesLayout[i][j] = new Path(this, j * CELLSIZE, 40 + i * CELLSIZE, tilesAsChars);
                }
                if (tilesAsChars[i][j].equals("S")) {
                    tilesLayout[i][j] = new Shrub(this, j * CELLSIZE, 40 + i * CELLSIZE);
                }
                if (tilesAsChars[i][j].equals("W")) {
                    tilesLayout[i][j] = new Wizard(this, j * CELLSIZE - 8, 32 + i * CELLSIZE, j, i);
                    this.wizard = (Wizard) tilesLayout[i][j];
                }
                tiles.add(tilesLayout[i][j]);
            }
        }

        for (Tile tile : tiles) {
            tile.getNeighbours();
        }

        System.out.println("Tiles created!");
        drawables.addAll(tiles);
    }


    /**
     * Receive key pressed signal from the keyboard.
     */
    @Override
    public void keyPressed() {
        loop();
        Character lastKey = key;
        if (lastKey.equals('r')) {
            restart();
        }
        else{
            for(Button button : buttons){
                if(lastKey.equals(button.keybind)){
                    button.performFunctionality();
                }
            }
        }
    }

    /**
     * Handles the mousePressed event.
     * This method is called by the processing environment when the mouse is pressed.
     * It triggers functions to check for button presses and tower building or upgrading.
     * @param e The MouseEvent object containing details about the mouse event.
     */
    @Override
    public void mousePressed(MouseEvent e) {
        checkButtonPress(e);
        checkTowerBuildingUpgrading(e);
    }

    /**
     * Checks if a button has been pressed.
     * Iterates through the list of buttons and triggers their functionality if pressed.
     * @param e The MouseEvent object containing details about the mouse event.
     */
    private void checkButtonPress(MouseEvent e) {
        for (Button button : buttons) {
            if (button.getX() < e.getX() && button.getY() < e.getY()
                    && button.getXFinal() >= e.getX() && button.getYFinal() >= e.getY() ) {
                button.performFunctionality();
                break;
            }
        }
    }

    /**
     * Deducts a specified amount of mana from the player's current mana.
     * @param manaCost The amount of mana to spend.
     * @return true if the mana was successfully spent; false if the player does not have enough mana.
     */
    public boolean spendMana(int manaCost){
        if (this.currentMana - manaCost > 0) {
            this.currentMana -= manaCost;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds a specified amount of mana to the player's current mana.
     * @param manaGain The amount of mana to gain.
     * @return true if the mana was successfully gained; false if the player's mana is already full.
     */
    public boolean gainMana(int manaGain){
        if (this.currentMana + manaGain < this.maxMana) {
            this.currentMana += manaGain * manaPoolSpell.manaGainedMultiplier;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if the player is building or upgrading a tower.
     * Based on the mouse event, it determines if a tower should be built or upgraded on the game grid.
     * @param e The MouseEvent object containing details about the mouse event.
     */
    public void checkTowerBuildingUpgrading(MouseEvent e) {
        for (int i = 0; i < tiles.size(); i++) {
            if (tiles.get(i).getX() < e.getX() && tiles.get(i).getY() < e.getY()
                    && tiles.get(i).getXFinal() >= e.getX() && tiles.get(i).getYFinal() >= e.getY()  && !gamePaused) {

                if (buildingTower && tiles.get(i) instanceof Grass){

                    if (spendMana(config.getTowerCost())) {
                        tiles.set(i, new Tower(this, tiles.get(i).getX(), tiles.get(i).getY()));
                        towers.add((Tower) tiles.get(i));
                    }
                }
                if (upgradingTowerRange && tiles.get(i) instanceof Tower) {
                    ((Tower) tiles.get(i)).upgradeRange();
                }
                if (upgradingTowerDamage && tiles.get(i) instanceof Tower){
                    ((Tower) tiles.get(i)).upgradeDamage();
                }
                if (upgradingTowerSpeed && tiles.get(i) instanceof Tower) {
                    ((Tower) tiles.get(i)).upgradeSpeed();
                }
            }
        }
    }


    /**
     * Draws a circle representing the range of a tower.
     * This is typically called when a tower is being hovered over to show its range on the grid.
     * @param x The x-coordinate of the tower's position.
     * @param y The y-coordinate of the tower's position.
     * @param towerRange The range of the tower.
     */
    public void drawRangeCircle(int x, int y, int towerRange) {
        if (towerHovering){
            pushMatrix();
            pushStyle();

            stroke(255, 255, 0);
            strokeWeight(1);
            noFill();
            noFill();
            ellipseMode(CENTER);
            ellipse(x + 16,  y + 16, towerRange * 2, towerRange * 2);

            popMatrix();
            popStyle();
        }
    }

    /**
     * Handles the mouseMoved event.
     * This method is called by the processing environment when the mouse is moved.
     * It triggers functionality to determine if the mouse is hovering over a button or tower.
     * @param e The MouseEvent object containing details about the mouse event.
     */
    @Override
    public void mouseMoved(MouseEvent e) {
        buttonHovering(e);
        towerHovering(e);
    }

    /**
     * Determines if the mouse is currently hovering over a button.
     * Changes button state to reflect whether it is being hovered over or not.
     * @param e The MouseEvent object containing details about the mouse event.
     */
    private void buttonHovering(MouseEvent e) {
        for (Button button : buttons){
            if (button.getX() <= e.getX() && button.getY() <= e.getY()
                && button.getXFinal() >= e.getX() && button.getYFinal() >= e.getY() && !gamePaused){
                if (!button.isSelected){
                    button.mouseHovering();
                }
            } else {
                button.mouseNotHovering();
            }
        }
    }


    /**
     * Determines if the mouse is currently hovering over a tower.
     * If hovering over a tower, updates variables related to tower information.
     * @param e The MouseEvent object containing details about the mouse event.
     */
    private void towerHovering(MouseEvent e){
        for (Tile tile : tiles){
            if (tile.getX() <= e.getX() && tile.getY() <= e.getY()
                    && tile.getXFinal() >= e.getX() && tile.getYFinal() >= e.getY()  && tile instanceof Tower){
                this.towerX = tile.getX();
                this.towerY = tile.getY();
                this.towerRange = ((Tower) tile).getTowerRange();
                towerHovering = true;

            }else if (tile.getX() <= e.getX() && tile.getY() <= e.getY()
                    && tile.getXFinal() >= e.getX() && tile.getYFinal() >= e.getY() && !(tile instanceof Tower)){
                towerHovering = false;
            }
        }
    }

    /**
     * Draws all the fireballs currently active in the game.
     */
    public void drawFireballs(){
        for (Fireball fireball: fireballs){
            fireball.draw();
        }
    }

    /**
     * Draws all the tiles in the game, and finds and draws the wizard tile specifically.
     */
    public void drawTiles() {
        int i = 0;
        while(i < tiles.size()) {
            if(tiles.get(i).type.equals("WIZARD")){
                wizardIndex = i;
                this.wizard = (Wizard) tiles.get(i);
            }
            else {
                tiles.get(i).draw();
            }
            ++i;
        }
        tiles.get(wizardIndex).draw();
    }


    /**
     * Draws indicators for all tower-type tiles, such as range indicators.
     */
    public void drawAllIndicators(){
        for (Tile tile : tiles){
            if (tile instanceof Tower){
                ((Tower) tile).drawIndicators();
            }
        }
    }


    /**
     * Initializes and draws the user interface buttons on the screen.
     */
    public void createButtons() {
        buttons.add(ffButton = new Button(this, 650, 60, "FF", true, 'f'));
        buttons.add(pauseButton = new Button(this, 650, 120, "P", true, 'p'));
        buttons.add(towerButton = new Button(this, 650, 180, "T", true, 't'));
        buttons.add(upgradeRangeButton = new Button(this, 650, 240, "U1", true, '1'));
        buttons.add(upgradeSpeedButton = new Button(this, 650, 300, "U2", true, '2'));
        buttons.add(upgradeDamageButton = new Button(this, 650, 360, "U3", true, '3'));
        buttons.add(manaPoolButton = new Button(this, 650, 420, "M", true, 'm'));
    }


    /**
     * Draw all elements in the game by current frame.
     */
    @Override
    public void draw() {
        this.currentTime = (float) frameCount / FPS;
        if (gameLost || gameWon || gamePaused){
            if (currentTime >= winTime + 8 && gameWon){
                proceedNextLevel();
            }
            return;
        }



        drawTiles();
        drawMonsters();
        drawFireballs();
        drawWizard();

        drawRangeCircle(this.towerX, this.towerY, this.towerRange);

        drawBorders();
        manaBar.drawManaStatic();
        manaBar.drawManaDynamic();
        drawButtons();
        drawAllIndicators();
        this.level.draw();
        drawWaveInfo();
        tick();
    }

    public void drawBorders(){
        pushMatrix();
        pushStyle();
        fill(136, 116, 76);
        noStroke();
        rect(0,0,CELLSIZE * BOARD_WIDTH + 1 + SIDEBAR,TOPBAR);
        rect(CELLSIZE*BOARD_WIDTH,0,SIDEBAR, CELLSIZE *BOARD_WIDTH + TOPBAR);
        popStyle();
        popMatrix();
    }


    /**
     * Updates the game state by a single tick. Responsible for checking win/loss conditions,
     * handling shooting logic, and mana regeneration.
     */
    public void tick(){
        checkGameWonLost();

        shootingCheck();
        // Check if the current second has changed since the last tick
        if (frameCount - previousFrameCount >= (frameRate)) {
            if (!fastForward){
                gainMana((int) config.getInitialManaGPS());
            }else{
                gainMana((int) (2 * config.getInitialManaGPS()));
            }

            previousFrameCount = frameCount; // Update previous frame count
        }

    }


    /**
     * Checks for shooting opportunities from each tower and attempts to shoot if a monster is in range.
     */
    public void shootingCheck(){
        for (Tower tower : towers){
            for (Monster monster : monsters){
                if (tower.displacement(monster) < tower.getTowerRange() && monster.alive){
                    tower.attemptToShoot(monster);
                }
            }
        }
    }

    /**
     * Displays information about the upcoming wave, such as the time remaining until it starts.
     */
    public void drawWaveInfo(){
        double totalWaveDuration = (this.level.waves.get(this.level.currentWave).duration
                + this.level.waves.get(this.level.currentWave).startTimer);
        double startTime = this.level.waves.get(this.level.currentWave).startTime;
        double timeElapsed = this.currentTime - startTime;
        int timeRemaining =  (int) totalWaveDuration - (int)timeElapsed;
        if (timeRemaining < 0) {timeRemaining = 0;}

        pushStyle();
        pushMatrix();

        textFont(mono);
        textSize(20);

        if (!lastWave){
            text("Wave " + (this.level.currentWave + 2) + " starts: "
                    + timeRemaining + " (LVL " + currentLevel + ")", 20, 27);
        }else{
            text(timeRemaining + " remaining for Level " + (currentLevel + 1), 20, 27);
        }

        popMatrix();
        popStyle();
    }



    /**
     * The main entry point for the application.
     *
     * @param args The command line arguments passed to the application.
     */
    public static void main(String[] args) {PApplet.main("WizardTD.App");}

    /**
     * Source: https://stackoverflow.com/questions/37758061/rotate-a-buffered-image-in-java
     *
     * @param pimg  The image to be rotated
     * @param angle between 0 and 360 degrees
     * @return the new rotated image
     */


    public PImage rotateImageByDegrees(PImage pimg, double angle) {
        BufferedImage img = (BufferedImage) pimg.getNative();
        double rads = Math.toRadians(angle);
        double sin = Math.abs(Math.sin(rads)), cos = Math.abs(Math.cos(rads));
        int w = img.getWidth();
        int h = img.getHeight();
        int newWidth = (int) Math.floor(w * cos + h * sin);
        int newHeight = (int) Math.floor(h * cos + w * sin);

        PImage result = this.createImage(newWidth, newHeight, ARGB);
        BufferedImage rotated = (BufferedImage) result.getNative();
        Graphics2D g2d = rotated.createGraphics();
        AffineTransform at = new AffineTransform();
        at.translate((newWidth - w) / 2, (newHeight - h) / 2);

        int x = w / 2;
        int y = h / 2;

        at.rotate(rads, x, y);
        g2d.setTransform(at);
        g2d.drawImage(img, 0, 0, null);
        g2d.dispose();
        for (int i = 0; i < newWidth; i++) {
            for (int j = 0; j < newHeight; j++) {
                result.set(i, j, rotated.getRGB(i, j));
            }
        }
        return result;
    }


    /**
     * Draws all the monsters currently in the game.
     * It also handles the removal of dead monsters from the game state.
     */
    public void drawMonsters(){
        int numMonsters = monsters.size()-1;

        if (this.newMonsterDead)
            for (int i = numMonsters; i < numMonsters; i--){
                if (!monsters.get(i).alive) {
                    monsters.remove(monsters.get(i));
                    this.newMonsterDead = false;
                }
            }

        for (Monster monster : monsters) {
            monster.draw();
        }
    }

    /**
     * Draws all buttons and their related ui to the screen
     */
    public void drawButtons(){
        for (Button button : buttons) {
            button.draw();
        }
    }

    /**
     * Draws the wizard character on the screen.
     */
    public void drawWizard(){
        this.wizard.draw();
    }


    /**
     * Generates paths for enemy movement by marking viable paths and connecting edges.
     */
    public void generateSpawnPaths() {

        pathFinder = new BSFNavigator();

        pathFinder.addNode(wizard);
        markPaths();
        findEdges();
        generateEnemyRoutes();
    }

    /**
     * Marks all path tiles for pathfinding purposes.
     */
    public void markPaths(){
        for (Tile tile : tiles) {
            if (tile instanceof Path){
                pathFinder.addNode(tile);
            }
        }
    }

    /**
     * Finds and adds edges between adjacent path tiles to establish connections for pathfinding.
     */
    public void findEdges(){
        for (Tile neighbour : this.wizard.neighbours) {
            if (pathFinder.nodes.containsKey(neighbour) && pathFinder.nodes.containsKey(wizard)) {
                pathFinder.addEdge(wizard, neighbour);
            }
        }

        for (Tile tile : tiles) {
            if(tile instanceof Path) {
                for (Tile neighbour : tile.neighbours) {
                    if (pathFinder.nodes.containsKey(neighbour) && pathFinder.nodes.containsKey(tile)) {
                        pathFinder.addEdge(tile, neighbour);
                    }
                }
            }
        }
    }


    /**
     * Generates routes for enemies to take from their spawn points to the wizard.
     */
    public void generateEnemyRoutes(){
        for (Tile spawn : monsters.get(0).returnSpawnPoints(tiles)) {
            LinkedList<Node> route = new LinkedList<>();
            route = pathFinder.navigateToDestination(spawn, wizard);
            spawn.viablePath = pathFinder.nodeToTiles(route);
            System.out.println("Route from " + spawn.getR() + " " + spawn.getC() + " to " + wizard.getR() + " " + wizard.getC() + " is " + spawn.viablePath.size() + " long.");
        }
    }

    /**
     * Checks if the game has been won or lost and updates the display accordingly.
     * If the game is lost, it displays a loss message and stops the game loop.
     * If the game is won, it displays a win message.
     */
    public void checkGameWonLost(){
        if (gameLost){
            pushMatrix();
            pushStyle();


            textFont(mono);
            textSize(40);
            fill(255, 255, 0);
            fill(0);
            textAlign(CENTER);
            text("YOU LOST:(", 350, 350);
            textSize(25);
            text("Press R to restart", 350, 380);
            gameRestarting = true;

            popStyle();
            popMatrix();

        } else if (gameWon) {
            pushStyle();
            pushMatrix();

            textFont(mono);
            textSize(40);
            fill(255, 255, 0);
            fill(0);
            textAlign(CENTER);
            text("You Win!", 350, 350);
            textSize(20);
            text("Prepare for Level " + (currentLevel + 1), 340, 385);
            winTime = currentTime;

            popStyle();
            popMatrix();
        }
    }
}