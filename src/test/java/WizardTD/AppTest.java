package WizardTD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import processing.awt.PGraphicsJava2D;
import processing.core.PGraphics;
import processing.core.PImage;
import processing.event.MouseEvent;

class AppTest {
    /**
     * Method under test: default or parameterless constructor of {@link App}
     */
    @Test
    void testConstructor() {
        App actualApp = new App();
        assertEquals(100, actualApp.width);
        assertTrue(actualApp.towers.isEmpty());
        assertEquals(App.BOARD_WIDTH, actualApp.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, actualApp.tilesAsChars.length);
        assertTrue(actualApp.tiles.isEmpty());
        assertTrue(actualApp.sprites.isEmpty());
        assertEquals(4, actualApp.requestImageMax);
        assertEquals(1, actualApp.pixelDensity);
        assertTrue(actualApp.monsters.isEmpty());
        assertEquals(100, actualApp.height);
        assertEquals(10.0f, actualApp.frameRate);
        assertFalse(actualApp.focused);
        assertTrue(actualApp.firstMouse);
        assertTrue(actualApp.fireballs.isEmpty());
        assertTrue(actualApp.drawables.isEmpty());
        assertEquals("config.json", actualApp.configPath);
        assertTrue(actualApp.buttons.isEmpty());
        assertTrue(actualApp.isLooping());
    }

    /**
     * Method under test: {@link App#keyPressed()}
     */
    @Test
    void testKeyPressed() {
        App app = new App();
        app.keyPressed();
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }

    /**
     * Method under test: {@link App#mousePressed(MouseEvent)}
     */
    @Test
    void testMousePressed() {
        App app = new App();
        MouseEvent mouseEvent = new MouseEvent("Native Object", 1L, 1, 1, 2, 3, 1, 3);

        app.mousePressed(mouseEvent);
        assertEquals(1, mouseEvent.getAction());
        assertTrue(mouseEvent.isShiftDown());
        assertEquals(3, mouseEvent.getY());
        assertEquals(2, mouseEvent.getX());
        assertEquals("Native Object", mouseEvent.getNative());
        assertEquals(1L, mouseEvent.getMillis());
        assertEquals(2, mouseEvent.getFlavor());
        assertEquals(3, mouseEvent.getCount());
        assertEquals(1, mouseEvent.getButton());
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }

    /**
     * Method under test: {@link App#spendMana(int)}
     */
    @Test
    void testSpendMana() {
        assertFalse((new App()).spendMana(1));
    }

    /**
     * Method under test: {@link App#spendMana(int)}
     */
    @Test
    void testSpendMana2() {
        App app = new App();
        assertTrue(app.spendMana(-1));
        assertEquals(1.0f, app.currentMana);
    }

    /**
     * Method under test: {@link App#gainMana(int)}
     */
    @Test
    void testGainMana() {
        assertFalse((new App()).gainMana(1));
    }

    /**
     * Method under test: {@link App#checkTowerBuildingUpgrading(MouseEvent)}
     */
    @Test
    void testCheckTowerBuildingUpgrading() {
        App app = new App();
        MouseEvent mouseEvent = new MouseEvent("Native Object", 1L, 1, 1, 2, 3, 1, 3);

        app.checkTowerBuildingUpgrading(mouseEvent);
        assertEquals(1, mouseEvent.getAction());
        assertTrue(mouseEvent.isShiftDown());
        assertEquals(3, mouseEvent.getY());
        assertEquals(2, mouseEvent.getX());
        assertEquals("Native Object", mouseEvent.getNative());
        assertEquals(1L, mouseEvent.getMillis());
        assertEquals(2, mouseEvent.getFlavor());
        assertEquals(3, mouseEvent.getCount());
        assertEquals(1, mouseEvent.getButton());
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }

    /**
     * Method under test: {@link App#checkTowerBuildingUpgrading(MouseEvent)}
     */
    @Test
    void testCheckTowerBuildingUpgrading2() {
        App app = new App();
        MouseEvent mouseEvent = new MouseEvent("Native Object", 1L, 1, 1, 2, 3, 1, 3);

        app.checkTowerBuildingUpgrading(mouseEvent);
        assertEquals(1, mouseEvent.getAction());
        assertTrue(mouseEvent.isShiftDown());
        assertEquals(3, mouseEvent.getY());
        assertEquals(2, mouseEvent.getX());
        assertEquals("Native Object", mouseEvent.getNative());
        assertEquals(1L, mouseEvent.getMillis());
        assertEquals(2, mouseEvent.getFlavor());
        assertEquals(3, mouseEvent.getCount());
        assertEquals(1, mouseEvent.getButton());
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gameRestarting);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }

    /**
     * Method under test: {@link App#drawRangeCircle(int, int, int)}
     */
    @Test
    void testDrawRangeCircle() {
        App app = new App();
        app.drawRangeCircle(2, 3, 1);
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }

    /**
     * Method under test: {@link App#mouseMoved(MouseEvent)}
     */
    @Test
    void testMouseMoved() {
        App app = new App();
        MouseEvent mouseEvent = new MouseEvent("Native Object", 1L, 1, 1, 2, 3, 1, 3);

        app.mouseMoved(mouseEvent);
        assertEquals(1, mouseEvent.getAction());
        assertTrue(mouseEvent.isShiftDown());
        assertEquals(3, mouseEvent.getY());
        assertEquals(2, mouseEvent.getX());
        assertEquals("Native Object", mouseEvent.getNative());
        assertEquals(1L, mouseEvent.getMillis());
        assertEquals(2, mouseEvent.getFlavor());
        assertEquals(3, mouseEvent.getCount());
        assertEquals(1, mouseEvent.getButton());
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }

    /**
     * Method under test: {@link App#drawFireballs()}
     */
    @Test
    void testDrawFireballs() {
        App app = new App();
        app.drawFireballs();
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }


    /**
     * Method under test: {@link App#drawAllIndicators()}
     */
    @Test
    void testDrawAllIndicators() {
        App app = new App();
        app.drawAllIndicators();
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }

    /**
     * Method under test: {@link App#drawAllIndicators()}
     */
    @Test
    void testDrawAllIndicators2() {
        App app = new App();
        app.drawAllIndicators();
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gameRestarting);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }

    /**
     * Method under test: {@link App#createButtons()}
     */
    @Test
    void testCreateButtons() {
        App app = new App();
        app.createButtons();
        assertEquals(7, app.buttons.size());
        Button button = app.towerButton;
        assertSame(app, button.window);
        assertEquals("BUTTON", button.type);
        assertEquals("T", button.label);
        assertEquals('t', button.keybind.charValue());
        assertFalse(button.isHovering);
        assertTrue(button.isHoverable);
        assertTrue(button.isClickable);
        assertEquals(0, button.fixedCost);
        assertFalse(button.buildingTower);
        Button button1 = app.ffButton;
        assertNull(button1.description);
        assertFalse(button1.buildingTower);
        assertEquals(110, button1.getYFinal());
        assertEquals(App.FPS, button1.getY());
        assertEquals(700, button1.getXFinal());
        assertEquals(650, button1.getX());
        assertFalse(button1.getSelected());
        assertEquals(0, button1.getCost());
        Button button2 = app.upgradeRangeButton;
        assertEquals(240, button2.getY());
        assertEquals(700, button2.getXFinal());
        assertEquals(650, button2.getX());
        assertFalse(button2.getSelected());
        assertEquals(0, button2.getCost());
        Button button3 = app.upgradeSpeedButton;
        assertEquals("BUTTON", button3.type);
        assertEquals('2', button3.keybind.charValue());
        assertFalse(button3.isHovering);
        assertTrue(button3.isHoverable);
        assertTrue(button3.isClickable);
        assertEquals(0, button3.fixedCost);
        assertFalse(button3.buildingTower);
        assertEquals(350, button3.getYFinal());
        assertEquals(300, button3.getY());
        assertEquals(700, button3.getXFinal());
        assertEquals(650, button3.getX());
        assertFalse(button3.getSelected());
        assertEquals(0, button3.getCost());
        assertTrue(button2.isClickable);
        assertEquals('1', button2.keybind.charValue());
        assertSame(app, button2.window);
        assertSame(app, button3.window);
        assertEquals('f', button1.keybind.charValue());
        Button button4 = app.upgradeDamageButton;
        assertFalse(button4.getSelected());
        assertEquals(650, button4.getX());
        assertEquals(410, button4.getYFinal());
        assertFalse(button4.buildingTower);
        Button button5 = app.pauseButton;
        assertEquals(0, button5.getCost());
        assertFalse(button5.getSelected());
        assertEquals(170, button5.getYFinal());
        assertFalse(button5.buildingTower);
        assertEquals(0, button5.fixedCost);
        assertTrue(button5.isClickable);
        assertEquals('p', button5.keybind.charValue());
        assertSame(app, button5.window);
        assertEquals(0, button4.fixedCost);
        assertEquals("BUTTON", button4.type);
        Button button6 = app.manaPoolButton;
        assertEquals(650, button6.getX());
        assertEquals(700, button6.getXFinal());
        assertFalse(button6.buildingTower);
        assertNull(button6.description);
        assertTrue(button6.isClickable);
        assertTrue(button6.isHoverable);
        assertEquals("BUTTON", button6.type);
        assertSame(app, button6.window);
        assertEquals("BUTTON", button1.type);
        assertSame(app, button1.window);
        assertNull(button2.description);
        assertFalse(button2.isHovering);
        assertEquals("BUTTON", button2.type);
        assertFalse(button1.isHovering);
        assertEquals(0, button4.getCost());
        assertEquals(360, button4.getY());
        assertEquals(120, button5.getY());
        assertFalse(button5.isHovering);
        assertEquals("BUTTON", button5.type);
        assertEquals('3', button4.keybind.charValue());
        assertFalse(button6.getSelected());
        assertEquals(470, button6.getYFinal());
        assertEquals("M", button6.label);
        assertSame(app, button4.window);
        assertFalse(button2.buildingTower);
        assertTrue(button2.isHoverable);
        assertTrue(button1.isHoverable);
        assertEquals(700, button4.getXFinal());
        assertEquals(700, button5.getXFinal());
        assertTrue(button5.isHoverable);
        assertFalse(button4.isHovering);
        assertEquals(420, button6.getY());
        assertEquals('m', button6.keybind.charValue());
        assertEquals(290, button2.getYFinal());
        assertTrue(button1.isClickable);
        assertEquals(650, button5.getX());
        assertTrue(button4.isHoverable);
        assertFalse(button6.isHovering);
        assertTrue(button4.isClickable);
    }



    /**
     * Method under test: {@link App#tick()}
     */
    @Test
    void testTick() {
        App app = new App();
        app.tick();
        assertEquals(0.0f, app.currentTime);
    }

    /**
     * Method under test: {@link App#rotateImageByDegrees(PImage, double)}
     */
    @Test
    void testRotateImageByDegrees() {
        App app = new App();
        PImage actualRotateImageByDegreesResult = app.rotateImageByDegrees(new PImage(1, 1), 10.0d);
        assertEquals(1, actualRotateImageByDegreesResult.width);
        assertEquals(1, actualRotateImageByDegreesResult.getModifiedX2());
        assertTrue(actualRotateImageByDegreesResult.isLoaded());
        int[] intArray = actualRotateImageByDegreesResult.pixels;
        assertEquals(1, intArray.length);
        assertTrue(actualRotateImageByDegreesResult.isModified());
        assertEquals(0, actualRotateImageByDegreesResult.getModifiedY1());
        assertEquals(2, actualRotateImageByDegreesResult.format);
        assertEquals(1, actualRotateImageByDegreesResult.height);
        assertEquals(0, actualRotateImageByDegreesResult.getModifiedX1());
        assertEquals(1, actualRotateImageByDegreesResult.getModifiedY2());
        assertEquals(1, actualRotateImageByDegreesResult.pixelDensity);
        assertEquals(-16777216, intArray[0]);
        assertEquals(1, actualRotateImageByDegreesResult.pixelHeight);
        assertEquals(1, actualRotateImageByDegreesResult.pixelWidth);
        assertEquals(1, actualRotateImageByDegreesResult.get().pixelWidth);
    }

    /**
     * Method under test: {@link App#rotateImageByDegrees(PImage, double)}
     */
    @Test
    void testRotateImageByDegrees2() {
        App app = new App();
        PImage actualRotateImageByDegreesResult = app.rotateImageByDegrees(new PImage(2, 1), 10.0d);
        assertEquals(2, actualRotateImageByDegreesResult.width);
        assertEquals(2, actualRotateImageByDegreesResult.getModifiedX2());
        assertTrue(actualRotateImageByDegreesResult.isLoaded());
        assertTrue(actualRotateImageByDegreesResult.isModified());
        assertEquals(0, actualRotateImageByDegreesResult.getModifiedY1());
        assertEquals(2, actualRotateImageByDegreesResult.format);
        assertEquals(1, actualRotateImageByDegreesResult.height);
        assertEquals(0, actualRotateImageByDegreesResult.getModifiedX1());
        assertEquals(1, actualRotateImageByDegreesResult.getModifiedY2());
        assertEquals(1, actualRotateImageByDegreesResult.pixelDensity);
        assertEquals(1, actualRotateImageByDegreesResult.pixelHeight);
        assertEquals(2, actualRotateImageByDegreesResult.pixelWidth);
        assertEquals(2, actualRotateImageByDegreesResult.get().pixelWidth);
    }

    /**
     * Method under test: {@link App#rotateImageByDegrees(PImage, double)}
     */
    @Test
    void testRotateImageByDegrees3() {
        App app = new App();
        PImage actualRotateImageByDegreesResult = app.rotateImageByDegrees(new PImage(6, 1), 10.0d);
        assertEquals(6, actualRotateImageByDegreesResult.width);
        assertEquals(6, actualRotateImageByDegreesResult.getModifiedX2());
        assertTrue(actualRotateImageByDegreesResult.isLoaded());
        assertEquals(12, actualRotateImageByDegreesResult.pixels.length);
        assertTrue(actualRotateImageByDegreesResult.isModified());
        assertEquals(0, actualRotateImageByDegreesResult.getModifiedY1());
        assertEquals(2, actualRotateImageByDegreesResult.format);
        assertEquals(2, actualRotateImageByDegreesResult.height);
        assertEquals(0, actualRotateImageByDegreesResult.getModifiedX1());
        assertEquals(2, actualRotateImageByDegreesResult.getModifiedY2());
        assertEquals(1, actualRotateImageByDegreesResult.pixelDensity);
        assertEquals(2, actualRotateImageByDegreesResult.pixelHeight);
        assertEquals(6, actualRotateImageByDegreesResult.pixelWidth);
        assertEquals(1, actualRotateImageByDegreesResult.get().pixelDensity);
    }

    /**
     * Method under test: {@link App#drawMonsters()}
     */
    @Test
    void testDrawMonsters() {
        App app = new App();
        app.drawMonsters();
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }


    /**
     * Method under test: {@link App#drawButtons()}
     */
    @Test
    void testDrawButtons() {
        App app = new App();
        app.drawButtons();
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }


    /**
     * Method under test: {@link App#markPaths()}
     */
    @Test
    void testMarkPaths() {
        App app = new App();
        app.markPaths();
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }

    /**
     * Method under test: {@link App#checkGameWonLost()}
     */
    @Test
    void testCheckGameWonLost() {
        App app = new App();
        app.checkGameWonLost();
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }

    /**
     * Method under test: {@link App#checkGameWonLost()}
     */
    @Test
    void testCheckGameWonLost2() {
        App app = new App();
        app.checkGameWonLost();
        assertFalse(app.exitCalled());
        assertEquals(0, app.wizardIndex);
        assertEquals(100, app.width);
        assertFalse(app.upgradingTowerSpeed);
        assertFalse(app.upgradingTowerRange);
        assertFalse(app.upgradingTowerDamage);
        assertTrue(app.towers.isEmpty());
        assertEquals(0, app.towerY);
        assertEquals(0, app.towerX);
        assertEquals(0, app.towerRange);
        assertFalse(app.towerHovering);
        assertEquals(App.BOARD_WIDTH, app.tilesLayout.length);
        assertEquals(App.BOARD_WIDTH, app.tilesAsChars.length);
        assertTrue(app.tiles.isEmpty());
        assertTrue(app.sprites.isEmpty());
        assertEquals(4, app.requestImageMax);
        assertEquals(0, app.previousFrameCount);
        assertEquals(0, app.pmouseY);
        assertEquals(0, app.pmouseX);
        assertEquals(0, app.pixelWidth);
        assertEquals(0, app.pixelHeight);
        assertEquals(1, app.pixelDensity);
        assertFalse(app.newMonsterDead);
        assertEquals(0, app.mouseY);
        assertEquals(0, app.mouseX);
        assertFalse(app.mousePressed);
        assertEquals(0, app.mouseButton);
        assertTrue(app.monsters.isEmpty());
        assertEquals(0.0f, app.maxMana);
        assertFalse(app.keyPressed);
        assertEquals(0, app.keyCode);
        assertEquals('\u0000', app.key);
        assertEquals(100, app.height);
        assertFalse(app.gameWon);
        assertFalse(app.gameRestarting);
        assertFalse(app.gamePaused);
        assertFalse(app.gameLost);
        assertEquals(10.0f, app.frameRate);
        assertEquals(0, app.frameCount);
        assertFalse(app.focused);
        assertTrue(app.firstMouse);
        assertTrue(app.fireballs.isEmpty());
        assertFalse(app.finished);
        assertFalse(app.fastForward);
        assertTrue(app.drawables.isEmpty());
        assertEquals(0, app.displayWidth);
        assertEquals(0, app.displayHeight);
        assertEquals(0.0f, app.currentTime);
        assertEquals(0.0f, app.currentMana);
        assertEquals("config.json", app.configPath);
        assertTrue(app.buttons.isEmpty());
        assertFalse(app.buildingTower);
        assertTrue(app.isLooping());
    }
}

