package WizardTD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Provides navigation functionality using Breadth-First Search (BFS) for pathfinding in the game.
 * It maps the tiles to nodes and finds the shortest path between two tiles.
 */
public class BSFNavigator {

    /** A mapping of tiles to their corresponding nodes in the graph. */
    public HashMap<Tile, Node> nodes = new HashMap<>();

    /** Constructs a BSFNavigator instance. */
    public BSFNavigator() {}

    /**
     * Adds a node representing a tile to the navigation graph.
     * Only tiles that are instances of Path or Wizard can be added.
     *
     * @param tile The tile to be added as a node.
     * @return The newly created Node associated with the tile, or null if the tile cannot be added.
     */
    public Node addNode(Tile tile) {
        if (tile instanceof Path || tile instanceof Wizard) {
            Node v = new Node(tile);
            nodes.put(tile, v);
            return v;
        } else {
            return null;
        }
    }

    /**
     * Adds an undirected edge between two tiles in the navigation graph.
     *
     * @param t1 The first tile to connect.
     * @param t2 The second tile to connect.
     */
    public void addEdge(Tile t1, Tile t2) {
        Node node = nodes.get(t1);
        Node nextNode = nodes.get(t2);
        node.addNeighbor(nextNode);
        nextNode.addNeighbor(node);
    }

    /**
     * Navigates from a starting tile to a destination tile using BFS.
     *
     * @param start The starting tile.
     * @param end The destination tile.
     * @return A linked list of nodes representing the path from start to end.
     */
    public LinkedList<Node> navigateToDestination(Tile start, Tile end){

        Node startNode = nodes.get(start);
        Node endNode = nodes.get(end);

        LinkedList<Node> queue = new LinkedList<>(); // LinkedList implements Queue
        HashMap<Node, Node> traversed = new HashMap<>();

        Node explorer = startNode;

        while(explorer != endNode) {

            LinkedList<Node> neighbors = explorer.neighbors; //
            for (Node n: neighbors) { //
                if (!traversed.containsKey(n)) {
                    traversed.put(n, explorer);
                    queue.add(n);
                }
            }
            explorer = queue.remove(); 
        }

        LinkedList<Node> path = new LinkedList<>();
        path.addFirst(explorer);
        while (explorer != startNode) {
            explorer = traversed.get(explorer);

            path.addFirst(explorer);
        }

        return path;
    }

    /**
     * Converts a linked list of nodes into an array list of tiles.
     *
     * @param pathFound The linked list of nodes representing the route.
     * @return An array list of tiles corresponding to the node route.
     */
    public ArrayList<Tile> nodeToTiles(LinkedList<Node> pathFound) {
        ArrayList<Tile> pathFromSpawn = new ArrayList<>();
        for(Node v : pathFound) {
            pathFromSpawn.add(v.tile);
        } return pathFromSpawn;
    }

}

