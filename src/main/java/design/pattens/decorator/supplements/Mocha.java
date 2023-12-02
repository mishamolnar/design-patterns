package design.pattens.decorator.supplements;

import design.pattens.decorator.Beverage;
import design.pattens.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +  " with I thought this is separate drink";
    }
}
