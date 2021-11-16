package strategy_pattern.duck;

import strategy_pattern.behavior.impl.FlyWithWings;
import strategy_pattern.behavior.impl.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real mallard duck");
    }
}
