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
public class Shrub extends Tile{
    public Shrub(App window, int x, int y) {
        super(window, x, y, "SHRUB", false);
        this.sprite = window.sprites.get("shrubSprite");
    }

}
