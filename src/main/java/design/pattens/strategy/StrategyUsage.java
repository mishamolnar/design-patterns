package design.pattens.strategy;

import design.pattens.strategy.characters.King;
import design.pattens.strategy.weapon.SwordBehaviour;

public class StrategyUsage {
    public static void main(String[] args) {
        Character king = new King();
        WeaponBehaviour sword = new SwordBehaviour();
        king.setWeapon(sword);
        king.fight();
    }
}
