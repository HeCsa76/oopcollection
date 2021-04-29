package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {
    private boolean shield = true;

    public Swordsman(boolean armored) {
        super(100, 10, armored);
    }

    @Override
    public void sufferDamage(int damage) {
        if (shield) {
            shield = false;
            return;
        }

        if (armored) {
            health -= (damage / 2);
        } else {
            health -= damage;
        }
    }
}