package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private int healthPoint;
    private final int damage;
    private final boolean isArmored;

    public MilitaryUnit(int healthPoint, int damage, boolean isArmored) {
        this.healthPoint = healthPoint;
        this.damage = damage;
        this.isArmored = isArmored;
    }

    public int getHitPoints() {
        return healthPoint;
    }

    public int doDamage() {
        return this.damage;
    }

    public void sufferDamage(int damage) {
        if (isArmored) {
            this.healthPoint -= damage / 2;
        } else {
            this.healthPoint -= damage;
        }
    }
}
