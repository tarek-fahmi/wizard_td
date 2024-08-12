package WizardTD;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TowerTest {
    /**
     * Method under test: {@link Tower#Tower(App, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        new Tower(new App(), 2, 3);

    }

    /**
     * Method under test: {@link Tower#Tower(App, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        new Tower(null, 2, 3);

    }

    /**
     * Method under test: {@link Tower#Tower(App, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        new Tower(new App(), Integer.MIN_VALUE, 3);

    }

    /**
     * Method under test: {@link Tower#Tower(App, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        new Tower(new App(), Integer.MIN_VALUE, Integer.MIN_VALUE);

    }

    /**
     * Method under test: {@link Tower#Tower(App, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        new Tower(new App(), Integer.MIN_VALUE, App.CELLSIZE);

    }

    /**
     * Method under test: {@link Tower#Tower(App, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        new Tower(new App(), 2, App.CELLSIZE);

    }

    /**
     * Method under test: {@link Tower#Tower(App, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        new Tower(new App(), App.CELLSIZE, App.CELLSIZE);

    }

    /**
     * Method under test: {@link Tower#Tower(App, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        new Tower(new App(), Integer.MIN_VALUE, 640);

    }

    /**
     * Method under test: {@link Tower#Tower(App, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        new Tower(new App(), 2, 640);

    }

    /**
     * Method under test: {@link Tower#rangeUpgradeCost()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRangeUpgradeCost() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Tower(new App(), 2, 3)).rangeUpgradeCost();
    }

    /**
     * Method under test: {@link Tower#speedUpgradeCost()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSpeedUpgradeCost() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Tower(new App(), 2, 3)).speedUpgradeCost();
    }

    /**
     * Method under test: {@link Tower#damageUpgradeCost()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDamageUpgradeCost() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Tower(new App(), 2, 3)).damageUpgradeCost();
    }

    /**
     * Method under test: {@link Tower#upgradeRange()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpgradeRange() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Tower tower = null;

        // Act
        tower.upgradeRange();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Tower#upgradeSpeed()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpgradeSpeed() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Tower tower = null;

        // Act
        tower.upgradeSpeed();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Tower#upgradeDamage()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpgradeDamage() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Tower tower = null;

        // Act
        tower.upgradeDamage();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Tower#updateTowerSprite()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateTowerSprite() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Tower tower = null;

        // Act
        tower.updateTowerSprite();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Tower#drawSpeedIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawSpeedIndicator() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Tower(new App(), 2, 3)).drawSpeedIndicator();
    }

    /**
     * Method under test: {@link Tower#drawSpeedIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawSpeedIndicator2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.drawSpeedIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Tower(new App(), 2, 3)).drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 0;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 1;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 2;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 3;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 4;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 5;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 6;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 7;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 8;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 9;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator12() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 10;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator13() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 11;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator14() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 12;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator15() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 13;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator16() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 14;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator17() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 15;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator18() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = Short.SIZE;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawDamageIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawDamageIndicator19() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.damageLevel = 17;
        tower.drawDamageIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Tower(new App(), 2, 3)).drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 0;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 1;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 2;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 3;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 4;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 5;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 6;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 7;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 8;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 9;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator12() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 10;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator13() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 11;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator14() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 12;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator15() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 13;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator16() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 14;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator17() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 15;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator18() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = Short.SIZE;
        tower.drawRangeIndicator();
    }

    /**
     * Method under test: {@link Tower#drawRangeIndicator()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawRangeIndicator19() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.rangeLevel = 17;
        tower.drawRangeIndicator();
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Tower#getTowerDamage()}
     *   <li>{@link Tower#getTowerRange()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTowerDamage() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   WizardTD.Tower.<init>
        //   A step in the arrange section threw an exception:
        //   FileNotFoundException config.json (No such file or directory)
        //   More information about the exception is provided in the support log.
        //   See https://diff.blue/R081 for further troubleshooting of this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Tower tower = null;

        // Act
        int actualTowerDamage = tower.getTowerDamage();
        int actualTowerRange = tower.getTowerRange();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Tower#getTowerFiringSpeed()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTowerFiringSpeed() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Tower(new App(), 2, 3)).getTowerFiringSpeed();
    }

    /**
     * Method under test: {@link Tower#getTowerCenterX()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTowerCenterX() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Tower(new App(), 2, 3)).getTowerCenterX();
    }

    /**
     * Method under test: {@link Tower#getTowerCenterY()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTowerCenterY() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Tower(new App(), 2, 3)).getTowerCenterY();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Tower(new App(), 2, 3)).drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 0;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 1;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 2;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 3;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 4;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 5;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 6;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 7;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 8;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 9;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators12() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 10;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators13() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 11;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators14() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 12;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators15() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 13;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators16() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 14;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators17() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 15;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators18() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = Short.SIZE;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators19() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 17;
        tower.damageLevel = 0;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators20() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 0;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators21() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 1;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators22() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 2;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators23() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 3;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators24() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 4;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators25() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 5;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators26() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 6;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators27() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 7;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators28() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 8;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators29() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 9;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators30() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 10;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators31() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 11;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators32() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 12;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators33() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 13;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators34() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 14;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators35() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 15;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators36() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = Short.SIZE;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators37() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 17;
        tower.damageLevel = 1;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators38() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 0;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators39() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 1;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators40() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 2;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators41() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 3;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators42() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 4;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators43() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 5;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators44() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 6;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators45() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 7;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators46() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 8;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators47() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 9;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators48() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 10;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators49() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 11;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators50() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 12;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#drawIndicators()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDrawIndicators51() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.speedLevel = 0;
        tower.rangeLevel = 13;
        tower.damageLevel = 2;
        tower.drawIndicators();
    }

    /**
     * Method under test: {@link Tower#draw()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDraw() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Tower(new App(), 2, 3)).draw();
    }

    /**
     * Method under test: {@link Tower#displacement(Monster)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDisplacement() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.io.FileNotFoundException: config.json (No such file or directory)
        //       at processing.core.PApplet.createReader(PApplet.java:6833)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   java.io.FileNotFoundException: config.json (No such file or directory)
        //       at java.io.FileInputStream.open0(Native Method)
        //       at java.io.FileInputStream.open(FileInputStream.java:195)
        //       at java.io.FileInputStream.<init>(FileInputStream.java:138)
        //       at processing.core.PApplet.createReader(PApplet.java:6825)
        //       at processing.core.PApplet.loadJSONObject(PApplet.java:6012)
        //       at WizardTD.JSONInterpreter.<init>(JSONInterpreter.java:27)
        //       at WizardTD.Tower.<init>(Tower.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        Tower tower = new Tower(new App(), 2, 3);
        tower.displacement(new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type"));
    }

    /**
     * Method under test: {@link Tower#attemptToShoot(Monster)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAttemptToShoot() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Tower tower = null;
        Monster monster = null;

        // Act
        tower.attemptToShoot(monster);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Tower#shoot(Monster)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testShoot() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Tower tower = null;
        Monster monster = null;

        // Act
        tower.shoot(monster);

        // Assert
        // TODO: Add assertions on result
    }
}

