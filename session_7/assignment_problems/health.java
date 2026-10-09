class health {
    private int health;
    private final int maxHealth;

    health(int maxHealth) {
        this.maxHealth = maxHealth;
        health = maxHealth;
    }

    void takeDamage(int amount) {
        if (amount > 0) {
            health = health - amount;

            if (health < 0) {
                health = 0;
            }
        }
    }
    void heal(int amount) {
        if (amount > 0) {
            health = health + amount;

            if (health > maxHealth) {
                health = maxHealth;
            }
        }
    }

    int getHealth() {
        return health;
    }
    public static void main(String[] args) {
        health c = new health(100);
        c.takeDamage(30);
        System.out.println("Health: " + c.getHealth());
        c.heal(50);
        System.out.println("Health: " + c.getHealth());
        c.takeDamage(150);
        System.out.println("Health: " + c.getHealth());
    }
}