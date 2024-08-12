package WizardTD;

import processing.core.PImage;
import java.util.*;

/**
 * Represents a path tile in the Wizard Tower Defense game.
 * Paths are where enemies travel towards the wizard. The appearance of the path tile
 * can change depending on its neighboring tiles.
 */
public class Path extends Tile{

    /**
     * Holds information about the existence of neighboring path tiles in each cardinal direction.
     */
    public HashMap<String, Boolean> neighbors = new HashMap<>();

    /**
     * A list of viable path tiles that can be used for pathfinding.
     */
    public LinkedList<Tile> viablePath = new LinkedList<>();

    /**
     * Constructor for the Path class. Calls the Tile superclass constructor and
     * assigns the appropriate sprite based on neighboring tiles.
     *
     * @param window       The main game window.
     * @param x            The x-coordinate of the path tile.
     * @param y            The y-coordinate of the path tile.
     * @param tilesAsChars A 2D array representing the game board with characters.
     */
    public Path(App window, int x, int y, String[][] tilesAsChars) {
        super(window, x, y, "PATH", false);
        this.sprite = assignSprite(tilesAsChars, this.getR(), this.getC());
    }


    /**
     * Assigns a sprite to the path tile based on the neighboring tiles.
     *
     * @param tilesAsChars A 2D array representing the game board with characters.
     * @param r            The row of the path tile.
     * @param c            The column of the path tile.
     * @return The assigned sprite image.
     */
    public PImage assignSprite(String[][] tilesAsChars, int r, int c) {
        neighbors = checkNeighbors(tilesAsChars, r, c);

        if ((neighbors.get("west") || neighbors.get("east")) &&
                !(neighbors.get("north") || neighbors.get("south"))) {
            return window.sprites.get("horizontalPathSprite");
        } else if (neighbors.get("west") && neighbors.get("east") &&
                (neighbors.get("north") && neighbors.get("south"))) {
            return window.sprites.get("nswePathSprite");
        } else if (!(neighbors.get("west") || neighbors.get("east")) &&
                (neighbors.get("north") || neighbors.get("south"))) {
            return window.sprites.get("verticalPathSprite");
        } else if (neighbors.get("west") && neighbors.get("east") &&
                neighbors.get("north") && !neighbors.get("south")) {
            return window.sprites.get("nwePathSprite");
        } else if (neighbors.get("west") && neighbors.get("east") &&
                !neighbors.get("north") && neighbors.get("south")) {
            return window.sprites.get("swePathSprite");
        } else if (neighbors.get("west") && !neighbors.get("east") &&
                neighbors.get("north") && neighbors.get("south")) {
            return window.sprites.get("nsePathSprite");
        } else if (!neighbors.get("west") && !neighbors.get("east") &&
                neighbors.get("north") && neighbors.get("south")) {
            return window.sprites.get("nswPathSprite");
        } else if (!neighbors.get("west") && neighbors.get("east") &&
                !neighbors.get("north") && neighbors.get("south")) {
            return window.sprites.get("sePathSprite");
        } else if (neighbors.get("west") && !neighbors.get("east") &&
                !neighbors.get("north") && neighbors.get("south")) {
            return window.sprites.get("swPathSprite");
        } else if (neighbors.get("west") && !neighbors.get("east") &&
                !neighbors.get("north") && neighbors.get("south")) {
            return window.sprites.get("swPathSprite");
        } else if (neighbors.get("west") && neighbors.get("east") &&
                neighbors.get("north") && neighbors.get("south")) {
            return window.sprites.get("nswePathSprite");
        } else if (neighbors.get("west") && !neighbors.get("east") &&
                neighbors.get("north") && !neighbors.get("south")) {
            return window.sprites.get("nwPathSprite");
        } else if (!neighbors.get("west") && neighbors.get("east") &&
                neighbors.get("north") && !neighbors.get("south")) {
            return window.sprites.get("ne" +
                    "PathSprite");
        }
        return null;
    }

    /**
     * Checks the neighboring tiles and updates the neighbors HashMap accordingly.
     *
     * @param tilesAsChars A 2D array representing the game board with characters.
     * @param r            The row of the path tile.
     * @param c            The column of the path tile.
     * @return The updated neighbors HashMap.
     */
    public HashMap<String, Boolean> checkNeighbors(String[][] tilesAsChars, int r, int c){
        neighbors.put("north", false);
        neighbors.put("east", false);
        neighbors.put("south", false);
        neighbors.put("west", false);

        if (r == 0) {
            neighbors.put("north", true);
        } else if (tilesAsChars[r - 1][c].equals("X") || tilesAsChars[r - 1][c].equals("W")) {
            neighbors.put("north", true);
        }
        if (c == 19) {
            neighbors.put("east", true);
        } else if (tilesAsChars[r][c + 1].equals("X") || tilesAsChars[r][c + 1].equals("W")) {
            neighbors.put("east", true);
        }
        if (r == 19) {
            neighbors.put("south", true);
        } else if (tilesAsChars[r + 1][c].equals("X") || tilesAsChars[r + 1][c].equals("W")) {
            neighbors.put("south", true);
        }
        if (c == 0) {
            neighbors.put("west", true);
        } else if (tilesAsChars[r][c - 1].equals("X") || tilesAsChars[r][c - 1].equals("W")) {
            neighbors.put("west", true);
        }
        return neighbors;
    }
}
