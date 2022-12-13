package com.gmail.juyonglee0208.chapter01.stop01.ducks;

import com.gmail.juyonglee0208.chapter01.stop01.Duck;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("삑삑!");
    }

    @Override
    public void display() {
        System.out.println("고무오리");
    }
}
