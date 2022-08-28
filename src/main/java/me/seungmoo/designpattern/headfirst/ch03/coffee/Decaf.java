package me.seungmoo.designpattern.headfirst.ch03.coffee;

import me.seungmoo.designpattern.headfirst.ch03.coffee.constants.Size;

public class Decaf extends Beverage {
    public Decaf(Size size) {
        super("디카페인 커피", size);
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
