package com.gmail.juyonglee0208.chapter01.stop03.ducks.stop02.ducks;

import com.gmail.juyonglee0208.chapter01.stop03.ducks.stop02.behavior.fly.FlyBehavior;
import com.gmail.juyonglee0208.chapter01.stop03.ducks.stop02.behavior.quack.QuackBehavior;

public class RubberDuck extends Duck {

    public RubberDuck(
        FlyBehavior flyBehavior,
        QuackBehavior quackBehavior) {
    }

    @Override
    public void quack() {
        System.out.println("삑삑!");
    }

    @Override
    public void display() {
        System.out.println("고무오리");
    }
}
