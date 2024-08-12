package WizardTD;

import java.util.ArrayList;
import java.util.Random;

/**
 * The {@code Wave} class represents a single wave of monsters within the game. It manages the
 * timing and spawning of monsters at regular intervals during the wave's duration.
 */
public class Wave {
    public float duration; // Duration of the wave in seconds.
    public float lastSpawnTime; // The last game time a monster was spawned.
    public float spawnInterval; // The interval at which monsters should be spawned.
    public boolean lastWave;
    public double startTimer; // Timer to delay the start of the wave.
    public double startTime; // Game time when the wave started.
    public ArrayList<Monster> monsters = new ArrayList<>(); // List of monsters to spawn in this wave.
    public ArrayList<Monster> spawnedMonsters = new ArrayList<>(); // List of monsters that have been spawned.
    public App window; // Reference to the main game window.
    private Random random = new Random(); // Random generator for spawning monsters.

    /**
     * Constructs a new Wave object to manage a wave of monsters.
     *
     * @param window      The game window that the wave is part of.
     * @param duration    The duration of the wave in which all monsters should be spawned.
     * @param startTimer  The delay before the wave starts, after the game begins or the last wave ends.
     */
    public Wave(App window, int duration, double startTimer, boolean lastWave) {
        this.window = window;
        this.duration = duration;
        this.startTimer = startTimer;
        this.startTime = window.currentTime;
        this.lastSpawnTime = 0; // Initializing last spawn time.
        this.lastWave = lastWave;
        window.lastWave = lastWave;
    }

    /**
     * Updates the wave's status, spawning monsters at the calculated intervals.
     */
    public void tick() {
        // Calculate time since the wave started.
        float timeSinceStart = (float) (window.currentTime - startTime);
        // Calculate the interval at which monsters should spawn.

        // Check if it's time to spawn the next monster.
        if (timeSinceStart - lastSpawnTime >= spawnInterval && !monsters.isEmpty()) {
            // Select a random monster from the list to spawn.
            int randomIndex = random.nextInt(monsters.size());
            Monster monster = monsters.get(randomIndex);
            monster.spawn();
            // Add to the list of spawned monsters.
            spawnedMonsters.add(monster);

            // Remove the spawned monster from the list of monsters to spawn.
            monsters.remove(randomIndex);

            // Add the monster to the main game's monster list.
            window.monsters.add(monster);

            // Update the last spawn time.
            lastSpawnTime = timeSinceStart;
        }
    }

    public boolean isWaveComplete() {
        if (!monsters.isEmpty()) {
            // Not all monsters have been spawned yet
            return false;
        }

        for (Monster monster : spawnedMonsters) {
            if (monster.alive) {
                // At least one monster is still alive
                return false;
            }
        }

        // All monsters have been spawned and are dead
        return true;
    }


    /**
     * Calls the tick method to update the wave. Intended to be called in the game's draw loop.
     */
    public void draw() {
        this.tick();
    }
}
