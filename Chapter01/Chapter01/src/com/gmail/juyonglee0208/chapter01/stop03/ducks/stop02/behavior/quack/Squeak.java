package com.gmail.juyonglee0208.chapter01.stop03.ducks.stop02.behavior.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("삑삑!");
    }
}
