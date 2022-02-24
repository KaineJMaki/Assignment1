package Mobs;

/**
 * This is the console for the user to execute the program. The user may call any
 * methods from the other classes.
 *
 * @author Kaine Makimoto
 * @version 1.0
 * @since 2022-02-24
 */

public class Console {
    public static void main(String[] args) {
        // Generate the mobs
        generateMob(new Zombie());
        generateMob(new Skeleton());
    }

    public static void generateMob(Mobs mob) {
        System.out.printf("Generating new mob: ");
        Stats stats = new Stats(mob);
        // The following modifiers may be added or removed to change the details of the mob
        stats.status();
        stats.healthUp();
        stats.attackDown();
        // Prints the stats of the mob
        mob.printStats();
    }
}
