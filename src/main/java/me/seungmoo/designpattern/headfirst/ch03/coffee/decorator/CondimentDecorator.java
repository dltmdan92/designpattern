package me.seungmoo.designpattern.headfirst.ch03.coffee.decorator;

import me.seungmoo.designpattern.headfirst.ch03.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected final Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        super(beverage.getDescription(), beverage.getSize());
        this.beverage = beverage;
    }

    public abstract String getDescription();
}
