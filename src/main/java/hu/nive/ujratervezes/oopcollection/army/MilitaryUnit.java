package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    protected int health;
    protected int damage;
    protected boolean armored;

    public MilitaryUnit(int health, int damage, boolean armored) {
        this.health = health;
        this.damage = damage;
        this.armored = armored;
    }

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {
        if (armored) {
            health -= (damage / 2);
        } else {
            health -= damage;
        }
    }

    public int getHitPoints() {
        return health;
    }
}
