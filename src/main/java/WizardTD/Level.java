package WizardTD;

import processing.data.JSONArray;
import java.util.ArrayList;

/**
 * Represents a level in the Wizard Tower Defense game.
 * A level contains multiple waves of monsters that the player must defend against.
 */
public class Level {

    /** The JSON configuration interpreter for the level setup. */
    public JSONInterpreter config;

    /** The total number of waves in the level. */
    public int waveCount;

    /** The index of the current wave. */
    public int currentWave = 0;
    /** A flag indicating whether we are currently on the last wave or not. */
    public boolean lastWave =  false;

    /** The application window that renders the game. */
    public App window;

    /** A dynamic list of waves for the current level. */
    public ArrayList<Wave> waves = new ArrayList<>();

    /**
     * Constructs a new Level object, initializing waves and the current wave.
     *
     * @param window the application window used for rendering and event handling.
     * @param config the JSON configuration interpreter for level setup.
     */
    public Level(App window, JSONInterpreter config){
        this.window = window;
        this.config = config;
        this.waveCount = config.getWaveCount();
        this.startWave(0);
    }

    /**
     * Updates the current wave state and progresses to the next wave if needed.
     * Also sets the game to a win state if all waves have been completed.
     */
    public void tick(){
        if (currentWave < waves.size()) { // Use size of waves instead of waveCount to ensure sync
            Wave current = waves.get(currentWave);
            current.tick(); // Update the current wave

            // Check if the current wave is complete
            if (current.isWaveComplete()) {
                // Proceed to next wave if there are more waves
                if (currentWave < waveCount - 1) {
                    proceedToNextWave();
                    startWave(currentWave);
                } else if (lastWave) {
                    // If the last wave is complete, the game is won
                    window.gameWon = true;
                }
            }
        }
    }

    /**
     * Renders the current wave to the window.
     * It implicitly calls the tick method to update the game state before drawing.
     */
    public void draw(){
        this.tick();
        this.waves.get(currentWave).draw();
    }

    /**
     * Increments the current wave index to move to the next wave.
     *
     * @return the index of the next wave.
     */
    public int proceedToNextWave(){
        return this.currentWave += 1;
    }

    /**
     * Starts a new wave based on the given index, adding monsters to the wave
     * as defined in the configuration.
     *
     * @param waveIndex the index of the wave to start.
     */
    public void startWave(int waveIndex) {
        // This flag should be set before the wave is added to the ArrayList
        lastWave = (waveIndex == waveCount - 1);

        int duration = config.getWaveDuration(waveIndex);
        double preWavePause = config.getPreWavePause(waveIndex);
        Wave wave = new Wave(this.window, duration, preWavePause, lastWave);

        JSONArray waveMonsters = config.getWaveMonsters(waveIndex);
        for (int monsterIndex = 0; monsterIndex < waveMonsters.size(); monsterIndex++) {
            String type = config.getMonsterType(waveIndex, monsterIndex);
            int hp = config.getMonsterHP(waveIndex, monsterIndex);
            double speed = config.getMonsterSpeed(waveIndex, monsterIndex);
            double armour = config.getMonsterArmour(waveIndex, monsterIndex);
            int manaGainedOnKill = config.getManaGainedOnKill(waveIndex, monsterIndex);
            int quantity = config.getMonsterQuantity(waveIndex, monsterIndex);

            for (int k = 0; k < quantity; k++) {
                Monster monster = new Monster(window, hp, speed, armour, manaGainedOnKill, type);
                wave.monsters.add(monster);
            }
            wave.spawnInterval = wave.duration / wave.monsters.size();
        }

        this.waves.add(wave);
    }
}
