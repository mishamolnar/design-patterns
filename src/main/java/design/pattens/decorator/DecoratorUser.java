package design.pattens.decorator;

import design.pattens.decorator.components.Espresso;
import design.pattens.decorator.supplements.Soy;
import design.pattens.decorator.supplements.Whip;

public class DecoratorUser {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        Beverage whipEspresso = new Whip(espresso);
        Beverage doubleWhipEspresso = new Whip(whipEspresso);
        Beverage doubleWhipEspressoWithSoy = new Soy(doubleWhipEspresso);
        System.out.println(doubleWhipEspressoWithSoy.getCost());
        System.out.println(doubleWhipEspressoWithSoy.getDescription());
    }
}
