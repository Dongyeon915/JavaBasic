package com.gmail.juyonglee0208.chapter01.stop03.ducks.stop02.behavior.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("저는 날수가 없습니다!");
    }
}
