package design.pattens.strategy;

public abstract class Character {
    private WeaponBehaviour weapon;

    public void fight() {
        weapon.performAttack();
    }

    public WeaponBehaviour getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponBehaviour weapon) {
        this.weapon = weapon;
    }
}
