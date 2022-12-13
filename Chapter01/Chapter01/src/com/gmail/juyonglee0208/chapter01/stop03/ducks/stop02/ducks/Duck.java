package com.gmail.juyonglee0208.chapter01.stop03.ducks.stop02.ducks;

import com.gmail.juyonglee0208.chapter01.stop03.ducks.stop02.behavior.fly.FlyBehavior;
import com.gmail.juyonglee0208.chapter01.stop03.ducks.stop02.behavior.quack.QuackBehavior;

/**
 * 다양한 오리를 만들기 위한 Class입니다.
 * <p>
 * 표준 객체지향 기법을 사용하는 Super Class입니다.
 * <p>
 * {@code Duck} Class를 확장해서 서로 다른 종류의 오리를 만들 수 있습니다.
 *
 * @author Juyong Lee
 * @since 1.0
 */
abstract public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * 오리의 울음 소리를 출력합니다.
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 오리가 헤엄치는 동작을 수행합니다.
     */
    public void swim() {
        System.out.println("모든 오리는 수영이 가능합니다!");
    }

    /**
     * 오리의 모양을 나타냅니다.
     * <p>
     * 모든 오리의 모양이 다르므로 {@code display} method는 abstract method로 구현되어 있습니다..
     */
    public abstract void display();

    /**
     * 오리가 나는 동작을 수행합니다.
     * <p>
     * 고무 오리도 날아다는 문제가 발생
     */
    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(
        FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(
        QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
