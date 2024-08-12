package WizardTD;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FireballTest {
    /**
     * Method under test: {@link Fireball#Fireball(App, Monster, Tower)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        App window = null;
        Monster monster = null;
        Tower tower = null;

        // Act
        Fireball actualFireball = new Fireball(window, monster, tower);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Fireball#move(int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMove() {
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

        App window = new App();
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");

        (new Fireball(window, monster, new Tower(new App(), 2, 3))).move(2, 3);
    }

    /**
     * Method under test: {@link Fireball#move(int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMove2() {
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

        App window = new App();
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");

        (new Fireball(window, monster, new Tower(new App(), 2, 3))).move(1, 1);
    }

    /**
     * Method under test: {@link Fireball#draw()}
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

        App window = new App();
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");

        (new Fireball(window, monster, new Tower(new App(), 2, 3))).draw();
    }

    /**
     * Method under test: {@link Fireball#draw()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDraw2() {
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

        App window = new App();
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");

        Fireball fireball = new Fireball(window, monster, new Tower(new App(), 2, 3));
        fireball.pursuing = false;
        fireball.draw();
    }

    /**
     * Method under test: {@link Fireball#tick()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTick() {
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

        App window = new App();
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");

        (new Fireball(window, monster, new Tower(new App(), 2, 3))).tick();
    }
}

