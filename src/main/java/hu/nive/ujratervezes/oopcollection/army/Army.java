package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (MilitaryUnit unit : army) {
            unit.sufferDamage(damage);
        }
        removeDeadUnits();
    }

    private void removeDeadUnits() {
        army.removeIf(unit -> unit.getHitPoints() < 25);
    }

    public int getArmyDamage() {
        int sum = 0;
        for (MilitaryUnit unit : army) {
            sum += unit.doDamage();
        }
        return sum;
    }

    public int getArmySize() {
        return army.size();
    }
}