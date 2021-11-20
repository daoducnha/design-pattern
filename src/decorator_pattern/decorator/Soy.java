package decorator_pattern.decorator;

import decorator_pattern.Beverage;
import decorator_pattern.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        switch (beverage.getSize()) {
            case TALL:
                cost += 0.1;
                break;
            case GRANDE:
                cost += .15;
                break;
            case VENTI:
                cost += .20;
                break;
            default:
                throw new IllegalArgumentException("Invalid Size");
        }

        return beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
