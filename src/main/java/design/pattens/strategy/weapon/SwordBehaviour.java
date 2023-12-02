package design.pattens.strategy.weapon;

import design.pattens.strategy.WeaponBehaviour;

public class SwordBehaviour implements WeaponBehaviour {

    public void performAttack() {
        System.out.println("ATTACKING WITH SWORD");
    }
}
