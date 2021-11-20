package decorator_pattern;

import decorator_pattern.beverage.DarkRoast;
import decorator_pattern.beverage.Espresso;
import decorator_pattern.beverage.HouseBlend;
import decorator_pattern.decorator.Discount;
import decorator_pattern.decorator.Mocha;
import decorator_pattern.decorator.Soy;
import decorator_pattern.decorator.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        print(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        print(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        print(beverage3);

        Beverage beverage4 = new Espresso();
        beverage4 = new Mocha(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4 = new Discount(beverage4);
        print(beverage4);
    }

    public static void print(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
