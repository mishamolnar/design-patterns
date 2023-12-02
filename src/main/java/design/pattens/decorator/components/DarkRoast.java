package design.pattens.decorator.components;

import design.pattens.decorator.Beverage;

public class DarkRoast implements Beverage {
    @Override
    public double getCost() {
        return 0.99;
    }

    @Override
    public String getDescription() {
        return "Chip and good";
    }
}
