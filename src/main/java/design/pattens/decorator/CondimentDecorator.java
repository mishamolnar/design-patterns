package design.pattens.decorator;

public abstract class CondimentDecorator implements Beverage {
    private Beverage beverage;
    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
