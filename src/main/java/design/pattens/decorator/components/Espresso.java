package design.pattens.decorator.components;

import design.pattens.decorator.Beverage;

public class Espresso implements Beverage {

    @Override
    public double getCost() {
        return 1.99;
    }


    @Override
    public String getDescription() {
        return "Best espresso in the town";
    }
}
