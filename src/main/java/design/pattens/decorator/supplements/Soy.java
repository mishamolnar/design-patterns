package design.pattens.decorator.supplements;

import design.pattens.decorator.Beverage;
import design.pattens.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() +  0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with best plant ever";
    }
}
