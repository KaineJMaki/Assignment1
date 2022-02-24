package Mobs;

/**
 * This is the Skeleton class, implementing the Mobs interface. It defines the specifications of the
 * Skeleton.
 *
 * @author Kaine Makimoto
 * @version 1.0
 * @since 2022-02-24
 */

public class Skeleton implements Mobs {
    // Set the basic stats of the zombie
    private boolean status = true;
    private int health = 60;
    private int attack = 7;

    // Override the methods from the interface
    @Override
    public boolean isAlive() {
        return status;
    }

    @Override
    public void alive() {
        status = true;
    }

    @Override
    public void dead() {
        status = false;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        // Corrects the health passing 100
        if (health > 100) {
            this.health = 100;
            // Corrects the health falling below 0
        } else if (health < 0 || this.status == false) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    // Prints all of the details about the skeleton
    public void printStats() {
        System.out.println("Skeleton");
        System.out.println("HP: " + this.health + "/" + health);
        System.out.println("Attack: " + this.attack);
        System.out.println("The opponent is currently " + (status ? "Alive" : "Dead") + "\n");
    }
}
