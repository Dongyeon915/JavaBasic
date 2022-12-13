package com.gmail.juyonglee0208.chapter01.stop02.ducks;

import com.gmail.juyonglee0208.chapter01.stop02.Duck;

/**
 * {@code RedheadDuck} Class는 아메리카흰죽지를 표현합니다.
 *
 * @author Juyong Lee
 * @see <a href="https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Redhead_duck_%28Aythya_americana%2C_male%29.jpg/1576px-Redhead_duck_%28Aythya_americana%2C_male%29.jpg?20091230031427">아메리카흰죽지</a>
 * @since 1.0
 */
public class RedheadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("아메리카흰죽지");
    }
}
