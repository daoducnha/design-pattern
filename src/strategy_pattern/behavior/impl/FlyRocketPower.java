package strategy_pattern.behavior.impl;

import strategy_pattern.behavior.FlyBehavior;

public class FlyRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
