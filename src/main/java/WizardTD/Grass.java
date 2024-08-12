package WizardTD;

/**
 * Represents a grass tile within the game.
 * Grass tiles are a specific type of tile on the game board.
 */
public class Grass extends Tile {

    /**
     * The main window reference where the game is being drawn.
     */
    protected App window;

    /**
     * The x-coordinate of the grass tile on the game window.
     */
    protected int x;

    /**
     * The y-coordinate of the grass tile on the game window.
     */
    protected int y;

    /**
     * The type of the tile, which is "GRASS" for grass tiles.
     */
    protected String type;

    /**
     * Constructs a Grass tile at a specified row and column in the game grid.
     *
     * @param window The reference to the main game window.
     * @param r      The row number where the grass tile is placed.
     * @param c      The column number where the grass tile is placed.
     */
    public Grass(App window, int r, int c) {
        super(window, r, c, "GRASS", true);
        this.sprite = window.sprites.get("grassSprite");
    }
}
