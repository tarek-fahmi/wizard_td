package WizardTD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyFloat;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MonsterTest {
    /**
     * Method under test: {@link Monster#Monster(App, int, double, double, int, String)}
     */
    @Test
    void testConstructor() {
        Monster actualMonster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");

        assertTrue(actualMonster.alive);
        assertEquals("Type", actualMonster.type);
        assertEquals(-9.0d, actualMonster.damageMultiplier);
        assertEquals(1, actualMonster.hp);
        assertFalse(actualMonster.spawned);
        assertEquals(10.0d, actualMonster.speed);
        assertEquals(1, actualMonster.initialHP);
        assertEquals(1, actualMonster.deathFrame);
        assertEquals(1, actualMonster.mana_gained_on_kill);
        assertNull(actualMonster.config);
        assertNull(actualMonster.window.testMonster);
    }

    /**
     * Method under test: {@link Monster#Monster(App, int, double, double, int, String)}
     */
    /**
     * Method under test: {@link Monster#Monster(App, int, double, double, int, String)}
     */
    @Test
    void testConstructor3() {
        Monster actualMonster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");

        assertTrue(actualMonster.alive);
        assertEquals("Type", actualMonster.type);
        assertEquals(-9.0d, actualMonster.damageMultiplier);
        assertEquals(1, actualMonster.hp);
        assertEquals(10.0d, actualMonster.speed);
        assertEquals(1, actualMonster.initialHP);
        assertEquals(1, actualMonster.deathFrame);
        assertEquals(1, actualMonster.mana_gained_on_kill);
        assertNull(actualMonster.config);
        assertFalse(actualMonster.spawned);
        assertEquals(App.BOARD_WIDTH, actualMonster.window.tilesAsChars.length);
    }

    /**
     * Method under test: {@link Monster#returnSpawnPoints(ArrayList)}
     */
    @Test
    void testReturnSpawnPoints() {
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");
        assertTrue(monster.returnSpawnPoints(new ArrayList<>()).isEmpty());
    }

    /**
     * Method under test: {@link Monster#returnSpawnPoints(ArrayList)}
     */
    @Test
    void testReturnSpawnPoints2() {
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");
        Grass grass = new Grass(new App(), 1, 1);

        grass.r = 0;
        Grass grass1 = new Grass(new App(), 1, 1);

        grass1.r = 19;
        Grass grass2 = new Grass(new App(), 1, 1);

        grass2.c = 0;
        Grass grass3 = new Grass(new App(), 1, 1);

        grass3.c = 19;
        Grass grass4 = new Grass(new App(), 1, 1);

        grass4.type = (String) "PATH";

        ArrayList<Tile> tileList = new ArrayList<>();
        tileList.add(new Grass(new App(), 1, 1));
        tileList.add(grass);
        tileList.add(grass1);
        tileList.add(grass2);
        tileList.add(grass3);
        tileList.add(grass4);
        assertTrue(monster.returnSpawnPoints(tileList).isEmpty());
    }


    /**
     * Method under test: {@link Monster#returnSpawnPoints(ArrayList)}
     */
    @Test
    void testReturnSpawnPoints4() {
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");
        Grass grass = new Grass(new App(), 1, 1);

        grass.r = 0;
        Grass grass1 = new Grass(new App(), 1, 1);

        grass1.r = 19;
        Grass grass2 = new Grass(new App(), 1, 1);

        grass2.c = 0;
        Grass grass3 = new Grass(new App(), 1, 1);

        grass3.c = 19;
        Grass grass4 = new Grass(new App(), 1, 1);

        grass4.type = (String) "PATH";

        ArrayList<Tile> tileList = new ArrayList<>();
        tileList.add(new Wizard(new App(), 2, 3, 1, 1));
        tileList.add(grass);
        tileList.add(grass1);
        tileList.add(grass2);
        tileList.add(grass3);
        tileList.add(grass4);
        assertTrue(monster.returnSpawnPoints(tileList).isEmpty());
    }

    /**
     * Method under test: {@link Monster#move(int, int)}
     */
    @Test
    void testMove() {
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");
        monster.move(1, 1);
        assertEquals(1, monster.y);
        assertEquals(1, monster.x);
        assertTrue(monster.atDestination);
    }

    /**
     * Method under test: {@link Monster#move(int, int)}
     */
    @Test
    void testMove2() {
        Monster monster = new Monster(new App(), 1, 0.5d, 10.0d, 1, "Type");
        monster.move(1, 1);
        assertEquals(0, monster.y);
        assertEquals(0, monster.x);
    }

    /**
     * Method under test: {@link Monster#move(int, int)}
     */
    @Test
    void testMove3() {
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");
        monster.move(0, 1);
        assertEquals(1, monster.y);
        assertTrue(monster.atDestination);
    }

    /**
     * Method under test: {@link Monster#move(int, int)}
     */
    @Test
    void testMove4() {
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");
        monster.move(-1, 1);
        assertEquals(1, monster.y);
        assertEquals(-1, monster.x);
        assertTrue(monster.atDestination);
    }

    /**
     * Method under test: {@link Monster#move(int, int)}
     */
    @Test
    void testMove5() {
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");
        monster.move(Integer.MIN_VALUE, 1);
        assertEquals(1, monster.y);
        assertEquals(-10, monster.x);
    }

    /**
     * Method under test: {@link Monster#move(int, int)}
     */
    @Test
    void testMove6() {
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");
        monster.move(1, 0);
        assertEquals(1, monster.x);
        assertTrue(monster.atDestination);
    }

    /**
     * Method under test: {@link Monster#move(int, int)}
     */
    @Test
    void testMove7() {
        Monster monster = new Monster(new App(), 1, 10.0d, 10.0d, 1, "Type");
        monster.move(1, -1);
        assertEquals(-1, monster.y);
        assertEquals(1, monster.x);
        assertTrue(monster.atDestination);
    }
}
