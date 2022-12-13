package com.gmail.juyonglee0208.chapter01.stop01.ducks;

import com.gmail.juyonglee0208.chapter01.stop01.Duck;

/**
 * {@code MallardDuck} Class는 청동오리를 표현합니다.
 *
 * @author Juyong Lee
 * @see <a href="https://upload.wikimedia.org/wikipedia/commons/d/d1/Anas_platyrhynchos_LC0014.jpg">청둥오리</a>
 * @since 1.0
 */
public class MallardDuck extends Duck {

    /**
     * 청둥오리의 외형을 표현합니다.
     */
    @Override
    public void display() {
        System.out.println("청둥오리");
    }
}
