package patterns.strategy;

import patterns.strategy.Interfaces.WeaponBehavior;

public abstract class Character {
    public WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeapon(WeaponBehavior wp) {
        this.weaponBehavior = wp;
    }
}
