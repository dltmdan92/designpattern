package me.seungmoo.designpattern.headfirst.ch03.coffee;

import me.seungmoo.designpattern.headfirst.ch03.coffee.constants.Size;

public class Espresso extends Beverage {
    public Espresso(Size size) {
        super("에스프레소", size);
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
