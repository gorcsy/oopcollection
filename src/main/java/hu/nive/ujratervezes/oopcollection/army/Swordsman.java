package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean shield = true;

    public Swordsman(boolean isArmored) {
        super(100, 10, isArmored);
    }

    @Override
    public void sufferDamage(int damage) {
        if (shield) {
            shield = false;
            damage = 0;
        }
        super.sufferDamage(damage);
    }
}