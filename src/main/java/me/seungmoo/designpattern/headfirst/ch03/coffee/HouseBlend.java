package me.seungmoo.designpattern.headfirst.ch03.coffee;

import me.seungmoo.designpattern.headfirst.ch03.coffee.constants.Size;

public class HouseBlend extends Beverage {
    public HouseBlend(Size size) {
        super("하우스 블렌드 커피", size);
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
