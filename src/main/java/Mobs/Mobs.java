package Mobs;

/**
 * This is the interface for the Mobs for a text-based video game. It defines the
 * attributes for all mobs.
 *
 * @author Kaine Makimoto
 * @version 1.0
 * @since 2022-02-24
 */

public interface Mobs {
    // Status attributes
    boolean isAlive();
    void alive();
    void dead();

    // Getter and setter for health
    int getHealth();
    void setHealth(int health);

    // Getter and setter for attacks
    int getAttack();
    void setAttack(int attack);

    // Print status
    void printStats();
}
