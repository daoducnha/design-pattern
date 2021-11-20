package decorator_pattern.decorator;

import decorator_pattern.Beverage;
import decorator_pattern.CondimentDecorator;

public class Discount extends CondimentDecorator {
    Beverage beverage;

    public Discount(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() * 0.8;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , and Discount 20%";
    }
}
