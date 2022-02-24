package Mobs;

/**
 * This is the interface for the Modifiers for a text-based video game. It allows the
 * user to modify attributes for all mobs.
 *
 * @author Kaine Makimoto
 * @version 1.0
 * @since 2022-02-24
 */

public interface Modifiers {
    // Alter the status of the mob
    void status();

    // Health modifiers
    void healthUp();
    void healthDown();

    // Attack modifiers
    void attackUp();
    void attackDown();
}
