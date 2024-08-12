package WizardTD;

/**
 * The {@code ManaPool} class represents the mana mechanics for a player in the game.
 * It keeps track of the mana used and adjusts the mana pool according to the game's rules.
 */
public class ManaPool {
    private App window; // Reference to the main game window for accessing global configurations.
    public int manaPoolUse = 0; // Counter for the number of times the mana pool has been used.
    public double manaGainedMultiplier = 1; // Multiplier for mana gained over time or through actions.
    public JSONInterpreter config; // Configuration interpreter for mana pool settings.

    /**
     * Constructs a new ManaPool associated with the given game window.
     *
     * @param window The game window that the mana pool is part of.
     */
    public ManaPool(App window) {
        this.window = window;
        this.config = window.config; // Loads configuration settings.
    }

    /**
     * Attempts to cast a spell by deducting the spell cost from the current mana.
     * If successful, also updates the maximum mana and mana gained multiplier.
     */
    public void castSpell() {
        int spellCost = getSpellCost(); // Determine the cost of casting the spell.

        // Check if the current mana is sufficient to cast the spell.
        if (window.currentMana - spellCost > 0) {
            window.currentMana -= spellCost; // Deduct the spell cost from the current mana.
            window.maxMana *= config.getManaPoolCapMultiplier(); // Increase the maximum mana.
            manaPoolUse += 1; // Increment the usage counter.
            manaGainedMultiplier += 0.1; // Increase the mana gained multiplier.
        }
    }

    /**
     * Calculates and returns the cost of casting a spell.
     *
     * @return The calculated spell cost based on initial cost and the number of times the mana pool has been used.
     */
    public int getSpellCost() {
        // Calculate the spell cost considering the initial cost and incremental cost per use.
        return config.getManaPoolInitialCost() + (config.getManaPoolCostIncrease() * manaPoolUse);
    }
}
