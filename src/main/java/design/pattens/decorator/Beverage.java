package design.pattens.decorator;

public interface Beverage {
    String DESCRIPTION = "Unknown beverage";

    double getCost();

    default String getDescription() {
        return DESCRIPTION;
    }
}
