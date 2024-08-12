package WizardTD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BSFNavigatorTest {
    /**
     * Method under test: default or parameterless constructor of {@link BSFNavigator}
     */
    @Test
    void testConstructor() {
        assertTrue((new BSFNavigator()).nodes.isEmpty());
    }

    /**
     * Method under test: {@link BSFNavigator#addNode(Tile)}
     */
    @Test
    void testAddNode() {
        BSFNavigator bsfNavigator = new BSFNavigator();
        assertNull(bsfNavigator.addNode(new Grass(new App(), 1, 1)));
    }

    /**
     * Method under test: {@link BSFNavigator#addNode(Tile)}
     */
    @Test
    void testAddNode2() {
        BSFNavigator bsfNavigator = new BSFNavigator();
        Node actualAddNodeResult = bsfNavigator.addNode(new Wizard(new App(), 2, 3, 1, 1));
        assertTrue(actualAddNodeResult.neighbors.isEmpty());
        assertTrue(actualAddNodeResult.tile instanceof Wizard);
    }

    /**
     * Method under test: {@link BSFNavigator#addEdge(Tile, Tile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddEdge() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        BSFNavigator bsfNavigator = null;
        Tile t1 = null;
        Tile t2 = null;

        // Act
        bsfNavigator.addEdge(t1, t2);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BSFNavigator#addEdge(Tile, Tile)}
     */

    /**
     * Method under test: {@link BSFNavigator#navigateToDestination(Tile, Tile)}
     */
    @Test
    void testNavigateToDestination() {
        BSFNavigator bsfNavigator = new BSFNavigator();
        Grass start = new Grass(new App(), 1, 1);

        assertEquals(1, bsfNavigator.navigateToDestination(start, new Grass(new App(), 1, 1)).size());
    }

    /**
     * Method under test: {@link BSFNavigator#nodeToTiles(LinkedList)}
     */
    @Test
    void testNodeToTiles() {
        BSFNavigator bsfNavigator = new BSFNavigator();
        assertTrue(bsfNavigator.nodeToTiles(new LinkedList<>()).isEmpty());
    }

    /**
     * Method under test: {@link BSFNavigator#nodeToTiles(LinkedList)}
     */
    @Test
    void testNodeToTiles2() {
        BSFNavigator bsfNavigator = new BSFNavigator();

        LinkedList<Node> nodeList = new LinkedList<>();
        nodeList.add(new Node(new Grass(new App(), 1, 1)));
        assertEquals(1, bsfNavigator.nodeToTiles(nodeList).size());
    }

    /**
     * Method under test: {@link BSFNavigator#nodeToTiles(LinkedList)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNodeToTiles3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at WizardTD.BSFNavigator.nodeToTiles(BSFNavigator.java:98)
        //   See https://diff.blue/R013 to resolve this issue.

        BSFNavigator bsfNavigator = new BSFNavigator();

        LinkedList<Node> nodeList = new LinkedList<>();
        nodeList.add(null);
        bsfNavigator.nodeToTiles(nodeList);
    }
}

