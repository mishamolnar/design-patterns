package design.pattens.decorator.supplements;

import design.pattens.decorator.Beverage;
import design.pattens.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return 0.10 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with something similar to milk";
    }
}
