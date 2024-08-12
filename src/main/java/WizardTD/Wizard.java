package WizardTD;

import processing.core.PApplet;
import processing.core.PImage;
import processing.data.JSONArray;
import processing.data.JSONObject;
import processing.event.MouseEvent;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import java.io.*;
import java.util.*;

/**
 * The Wizard class represents a wizard character in the game which is placed on the game board.
 * It extends from the Tile class as it occupies a tile on the board.®
 *
 */
public class Wizard extends Tile{

    /**
     * Constructor for creating a new Wizard object.
     *
     * @param window The main application window where the game is rendered.
     * @param x      The x-coordinate of the wizard on the game board (in pixels).
     * @param y      The y-coordinate of the wizard on the game board (in pixels).
     * @param c      The column of the wizard on the game grid.
     * @param r      The row of the wizard on the game grid.
     */
    public Wizard(App window, int x, int y, int c, int r) {
        super(window, x, y, "WIZARD", c, r);
        this.sprite = window.sprites.get("wizardSprite");
    }
}
