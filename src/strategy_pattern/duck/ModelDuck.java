package strategy_pattern.duck;

import strategy_pattern.behavior.impl.FlyNoWay;
import strategy_pattern.behavior.impl.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a model duck!");
    }
}
