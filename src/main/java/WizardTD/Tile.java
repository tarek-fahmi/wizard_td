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


public abstract class Tile implements DrawableElement{
    public App window;
    public int x;
    public int y;
    public String type;
    public PImage sprite;
    public int xFinal;
    public int yFinal;
    public int r;
    public int c;
    public Tile northTile;
    public Tile southTile;
    public Tile eastTile;
    public Tile westTile;
    public boolean isClickable;
    public boolean[] connectingPoints;
    public Tile[] neighbours;
    public int indexRow;
    public int indexCol;
    public boolean isEdge;
    public ArrayList<Tile> viablePath;

    public Tile(App window, int x, int y, String type, boolean clickable){
        this.window = window;
        this.r = ((y - 40) / 32);
        this.c = ((x) / 32);
        this.x = x;
        this.y = y;
        this.type = type;
        this.isClickable = clickable;
        this.xFinal = x + 32;
        this.yFinal = y + 32;

        getNeighbours();
    }
    public Tile(App window, int x, int y, String type, int c, int r){
        this.window = window;
        this.r = r;
        this.c = c;
        this.x = x;
        this.y = y;
        this.type = type;
        this.isClickable = false;
        this.xFinal = x + 32;
        this.yFinal = y + 32;
    }

    public boolean getClickability() {return this.isClickable;}

    public void getNeighbours() {

        connectingPoints = new boolean[] {false, false, false, false};
        neighbours = new Tile[4];

        for (int i = 0; i < 4; i++) {
            try{
                if (i == 0){
                    neighbours[i] = window.tilesLayout[this.r - 1][this.c];
                } else if (i == 1){
                    neighbours[i] = window.tilesLayout[this.r + 1][this.c];
                } else if (i == 2){
                    neighbours[i] = window.tilesLayout[this.r][this.c - 1];
                } else if (i == 3){
                    neighbours[i] = window.tilesLayout[this.r][this.c + 1];
                }

                if(this instanceof Wizard){
                    System.out.println(neighbours[i].type);
                }

                System.out.println(neighbours[i].type);
            } catch (Exception e){
                if (this instanceof Wizard){
                    System.out.println(this.getC() + " " + this.getR());
                }
                neighbours[i] = null;
                connectingPoints[i] = true;
                this.isEdge = true;
            }

            if (neighbours[i] instanceof Path){
                connectingPoints[i] = true;
                this.isEdge = true;
            }
        }
    }

        public int getX(){return this.x;}

    public int getY(){return this.y;}
    public int getR(){return this.r;}
    public int getC(){return this.c;}

    public int getXFinal(){return this.xFinal;}

    public int getYFinal(){return this.yFinal;}

    public void draw(){
        // Handles graphics (should only be a line or 2)
        try{
        window.image(this.sprite, this.x, this.y);
        } catch (Exception e){
            window.image(window.sprites.get("error"), this.x, this.y);
        }
    }

}