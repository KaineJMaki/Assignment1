package Mobs;

/**
 * This is the stats class, which allows the user to modify the specific
 * stats of a mob.
 *
 * @author Kaine Makimoto
 * @version 1.0
 * @since 2022-02-24
 */

public class Stats implements Modifiers {
    // Constructor for a basic mob
    protected Mobs mob;

    public Stats() { }

    public Stats(Mobs mob) {
        this.mob = mob;
    }

    @Override
    // Switches the status of the mob
    public void status() {
        if (mob.isAlive()) {
            mob.dead();
        } else {
            mob.alive();
        }
    }

    @Override
    // Increases the mob's health by 10
    public void healthUp() {
        mob.setHealth(mob.getHealth() + 10);
    }

    @Override
    // Decreases the mob's health by 10
    public void healthDown() {
        mob.setHealth(mob.getHealth() - 10);
    }

    @Override
    // Increases the mob's attack by 5
    public void attackUp() {
        mob.setAttack(mob.getAttack() + 5);
    }

    @Override
    // Decreases the mob's attack by 5
    public void attackDown() {
        mob.setAttack(mob.getAttack() - 5);
    }
}
