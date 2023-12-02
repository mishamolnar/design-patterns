package design.pattens.decorator.components;

import design.pattens.decorator.Beverage;

public class Decaf implements Beverage {
    @Override
    public double getCost() {
        return 1.05;
    }

    @Override
    public String getDescription() {
        return "this is something called decaf";
    }
}
