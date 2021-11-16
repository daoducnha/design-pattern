package strategy_pattern;

import strategy_pattern.behavior.impl.FlyRocketPower;
import strategy_pattern.duck.Duck;
import strategy_pattern.duck.MallardDuck;
import strategy_pattern.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        System.out.println("==========================");
        Duck model = new ModelDuck();
        model.performFly();;
        model.setFlyBehavior(new FlyRocketPower());
        model.performFly();
    }
}
