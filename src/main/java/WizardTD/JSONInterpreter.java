package WizardTD;

import processing.core.PApplet;
import processing.data.JSONArray;
import processing.data.JSONObject;

import java.io.File;

/**
 * Interprets JSON configuration for the Wizard Tower Defense game.
 * Allows access to various configuration parameters such as initial tower stats,
 * mana parameters, wave details, and monster attributes.
 */
public class JSONInterpreter {

    /**
     * A static JSONObject to hold the game configuration.
     */
    public static JSONObject configObj;

    /**
     * Constructs a JSONInterpreter and loads the JSON configuration from the specified absolute path.
     *
     * @param absPath The absolute path to the JSON configuration file.
     */
    public JSONInterpreter(String absPath) {
        configObj = PApplet.loadJSONObject(new File(absPath));
    }

    // The following methods are static and provide access to specific game configuration parameters:


    public static String getLevelLayout() {
        return configObj.getString("layout");
    }

    public static int getInitialTowerDamage() {
        return configObj.getInt("initial_tower_damage");
    }

    public static int getInitialTowerRange() {
        return configObj.getInt("initial_tower_range");
    }

    public static double getInitialTowerSpeed() {
        return configObj.getDouble(("initial_tower_firing_speed"));
    }

    public static int getInitialMana() {
        return configObj.getInt(("initial_mana"));
    }
    public static int getInitialManaCap(){return configObj.getInt(("initial_mana_cap"));}

    public static double getInitialManaGPS() {
        return configObj.getDouble(("initial_mana_gained_per_second"));
    }

    public static int getTowerCost() {
        return configObj.getInt(("tower_cost"));
    }

    public static int getManaPoolInitialCost() {
        return configObj.getInt(("mana_pool_spell_initial_cost"));
    }

    public static int getManaPoolCostIncrease() {
        return configObj.getInt(("mana_pool_spell_cost_increase_per_use"));
    }

    public static double getManaPoolCapMultiplier() {
        return configObj.getDouble(("mana_pool_spell_cap_multiplier"));
    }

    public static double getManaPoolManaGainedMultiplier() {
        return configObj.getDouble(("mana_pool_spell_mana_gained_multiplier"));
    }

    public int getWaveCount(){
        return configObj.getJSONArray("waves").size();
    }

    public int getWaveDuration(int wave) {
        try {
            JSONArray waveArray = configObj.getJSONArray("waves");
            return waveArray.getJSONObject(wave).getInt("duration");
        } catch (Exception e) {
            System.err.println("Invalid wave index!");
        }
        return 1;
    }

    public double getPreWavePause(int wave) {
        try {
            JSONArray waveArray = configObj.getJSONArray("waves");
            return waveArray.getJSONObject(wave).getDouble("pre_wave_pause");
        } catch (Exception e) {
            System.err.println("Invalid wave index!");
        }
        return 1;
    }

    public JSONArray getWaveMonsters(int waveIndex) {
        JSONArray waveArray = configObj.getJSONArray("waves");
        return waveArray.getJSONObject(waveIndex).getJSONArray("monsters");
    }

    public String getMonsterType(int waveIndex, int monsterIndex){
        return getWaveMonsters(waveIndex).getJSONObject(monsterIndex).getString("type");
    }

    public int getMonsterHP(int waveIndex, int monsterIndex){
        return getWaveMonsters(waveIndex).getJSONObject(monsterIndex).getInt("hp");
    }

    public double getMonsterSpeed(int waveIndex, int monsterIndex){
        return getWaveMonsters(waveIndex).getJSONObject(monsterIndex).getDouble("speed");
    }

    public double getMonsterArmour(int waveIndex, int monsterIndex){
        return getWaveMonsters(waveIndex).getJSONObject(monsterIndex).getDouble("armour");
    }

    public int getMonsterQuantity(int waveIndex, int monsterIndex){
        return getWaveMonsters(waveIndex).getJSONObject(monsterIndex).getInt("quantity");
    }

    public int getManaGainedOnKill(int waveIndex, int monsterIndex){
        return getWaveMonsters(waveIndex).getJSONObject(monsterIndex).getInt("mana_gained_on_kill");
    }
}