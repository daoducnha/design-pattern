package strategy_pattern.behavior.impl;

import strategy_pattern.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying!!");
    }
}
