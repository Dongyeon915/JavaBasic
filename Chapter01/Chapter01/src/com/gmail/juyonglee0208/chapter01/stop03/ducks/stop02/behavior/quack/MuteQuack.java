package com.gmail.juyonglee0208.chapter01.stop03.ducks.stop02.behavior.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("저는 울음 소리를 낼수가 없어요!");
    }
}
