package hu.nive.ujratervezes.oopcollection.army;

import java.util.*;

public class Army {
    private final List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (MilitaryUnit militaryUnit : army) {
            militaryUnit.sufferDamage(damage);
        }

        army.removeIf(militaryUnit -> militaryUnit.health < 25);
    }

    public int getArmyDamage() {
        int damage = 0;
        for (MilitaryUnit militaryUnit : army) {
            damage += militaryUnit.doDamage();
        }

        return damage;
    }

    public int getArmySize() {
        return army.size();
    }
}