package WizardTD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TileTest {
    /**
     * Method under test: {@link Tile#getClickability()}
     */
    @Test
    void testGetClickability() {
        assertTrue((new Grass(new App(), 1, 1)).getClickability());
    }

    /**
     * Method under test: {@link Tile#getNeighbours()}
     */
    @Test
    void testGetNeighbours() {
        Grass grass = new Grass(new App(), 1, 1);
        grass.getNeighbours();
        assertEquals(4, grass.neighbours.length);
        assertTrue(grass.isEdge);
        boolean[] booleanArray = grass.connectingPoints;
        assertEquals(4, booleanArray.length);
        assertTrue(booleanArray[0]);
        assertTrue(booleanArray[1]);
        assertTrue(booleanArray[2]);
        assertTrue(booleanArray[3]);
    }

    /**
     * Method under test: {@link Tile#getNeighbours()}
     */
    @Test
    void testGetNeighbours2() {
        Wizard wizard = new Wizard(new App(), 2, 3, 1, 1);
        wizard.getNeighbours();
        boolean[] booleanArray = wizard.connectingPoints;
        assertEquals(4, booleanArray.length);
        assertTrue(wizard.isEdge);
        assertEquals(4, wizard.neighbours.length);
        assertTrue(booleanArray[0]);
        assertTrue(booleanArray[1]);
        assertTrue(booleanArray[2]);
        assertTrue(booleanArray[3]);
    }

    /**
     * Method under test: {@link Tile#getNeighbours()}
     */
    @Test
    void testGetNeighbours3() {
        Grass grass = new Grass(new App(), Integer.MIN_VALUE, 1);
        grass.getNeighbours();
        assertEquals(4, grass.neighbours.length);
        assertTrue(grass.isEdge);
        boolean[] booleanArray = grass.connectingPoints;
        assertEquals(4, booleanArray.length);
        assertTrue(booleanArray[0]);
        assertTrue(booleanArray[1]);
        assertTrue(booleanArray[2]);
        assertTrue(booleanArray[3]);
    }

    /**
     * Method under test: {@link Tile#getNeighbours()}
     */
    @Test
    void testGetNeighbours4() {
        Grass grass = new Grass(new App(), Integer.MIN_VALUE, Integer.MIN_VALUE);
        grass.getNeighbours();
        assertEquals(4, grass.neighbours.length);
        assertTrue(grass.isEdge);
        boolean[] booleanArray = grass.connectingPoints;
        assertEquals(4, booleanArray.length);
        assertTrue(booleanArray[0]);
        assertTrue(booleanArray[1]);
        assertTrue(booleanArray[2]);
        assertTrue(booleanArray[3]);
    }

    /**
     * Method under test: {@link Tile#getX()}
     */
    @Test
    void testGetX() {
        assertEquals(1, (new Grass(new App(), 1, 1)).getX());
    }

    /**
     * Method under test: {@link Tile#getY()}
     */
    @Test
    void testGetY() {
        assertEquals(1, (new Grass(new App(), 1, 1)).getY());
    }

    /**
     * Method under test: {@link Tile#getR()}
     */
    @Test
    void testGetR() {
        assertEquals(-1, (new Grass(new App(), 1, 1)).getR());
    }

    /**
     * Method under test: {@link Tile#getC()}
     */
    @Test
    void testGetC() {
        assertEquals(0, (new Grass(new App(), 1, 1)).getC());
    }

    /**
     * Method under test: {@link Tile#getXFinal()}
     */
    @Test
    void testGetXFinal() {
        assertEquals(33, (new Grass(new App(), 1, 1)).getXFinal());
    }

    /**
     * Method under test: {@link Tile#getYFinal()}
     */
    @Test
    void testGetYFinal() {
        assertEquals(33, (new Grass(new App(), 1, 1)).getYFinal());
    }

    /**
     * Method under test: {@link Tile#draw()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDraw() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Tile tile = null;

        // Act
        tile.draw();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Tile#draw()}
     */
}

