package me.seungmoo.designpattern.headfirst.ch03.coffee;

import me.seungmoo.designpattern.headfirst.ch03.coffee.constants.Size;

// 상속은 강력하지만 OCP 원칙에는 불리하다. -> 상속보다는 구성(composition)을 사용해보도록 하자.
public abstract class Beverage {

    protected final String description;
    protected final Size size;

    public Beverage(String description, Size size) {
        this.description = description;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    // 또한 Beverage클래스의 메서드 로직이 변경되면 모든 자식 클래스들이 영향을 받는다.

    public abstract double cost();

    public Size getSize() {
        return size;
    }
}
