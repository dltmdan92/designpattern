package me.seungmoo.designpattern.headfirst.ch03.coffee;

import me.seungmoo.designpattern.headfirst.ch03.coffee.constants.Size;

public class DarkRoast extends Beverage {
    public DarkRoast(Size size) {
        super("다크 로스트 커피", size);
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
