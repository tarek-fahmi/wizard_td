package WizardTD;

import processing.core.PFont;

/**
 * The ManaBar class is responsible for visualizing the player's current mana
 * in the game's interface. It displays both a static and a dynamic representation
 * of the mana bar.
 */
public class ManaBar {

    private App window;

    /**
     * Constructor for ManaBar.
     *
     * @param window The main application window where the mana bar will be displayed.
     */
    public ManaBar(App window) {
        this.window = window;
    }

    /**
     * Draws the static components of the mana bar on the screen. This includes
     * any non-changing visual elements such as labels and outlines.
     */
    public void drawManaStatic() {
        window.pushMatrix();
        window.pushStyle();

        window.textFont(window.mono);
        window.text("MANA:", 250, 32);
        window.stroke(0, 0, 0);
        window.strokeWeight(3);
        window.fill(255, 255, 255);
        window.rect(370, 7, 350, 25);

        window.popMatrix();
        window.popStyle();
    }

    /**
     * Draws the dynamic components of the mana bar, such as the current mana level.
     * The bar's length and the displayed mana values change as the player's mana
     * updates during gameplay.
     */
    public void drawManaDynamic() {
        window.pushMatrix();
        window.pushStyle();

        window.fill(0, 0, 255);
        window.stroke(0, 0, 0);
        window.strokeWeight(3);
        // The width of the mana bar is a fraction of the maximum width based on the current mana ratio
        window.rect(370, 7, 350 * (window.currentMana / window.maxMana), 25);

        window.fill(0);
        window.textSize(20);
        // Display the current mana over the maximum mana
        window.text(Math.round(window.currentMana) + "/" + Math.round(window.maxMana), 500, 27);

        window.popMatrix();
        window.popStyle();
    }
}
