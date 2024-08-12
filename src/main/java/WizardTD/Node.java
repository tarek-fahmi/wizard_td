package WizardTD;

import java.util.LinkedList;

/**
 * Represents a node in the graph of paths in the game.
 * Nodes are connected to each other to form the intersecting paths where characters can move.
 */
public class Node {
    /** A list of neighbor nodes that are directly reachable from this node. */
    public LinkedList<Node> neighbors;

    /** The tile associated with this node, representing its position and content in the game grid. */
    public Tile tile;

    /**
     * Constructs a new Node, representing a specified tile.
     *
     * @param tile The tile that this node is associated with.
     */
    public Node(Tile tile) {
        this.tile = tile;
        neighbors = new LinkedList<>();
    }

    /**
     * Adds a neighbor to this node if it is not already present.
     *
     * @param neighbor The neighbor node to be added.
     */
    public void addNeighbor(Node neighbor) {
        if (!neighbors.contains(neighbor)) {
            neighbors.add(neighbor);
        }
    }
}
