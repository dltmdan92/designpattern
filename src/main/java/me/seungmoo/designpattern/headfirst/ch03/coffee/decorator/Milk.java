package me.seungmoo.designpattern.headfirst.ch03.coffee.decorator;

import me.seungmoo.designpattern.headfirst.ch03.coffee.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        double plusCost = 0.0;
        switch (beverage.getSize()) {
            case TALL -> plusCost = 0.10;
            case GRANDE -> plusCost = 0.15;
            case VENTI -> plusCost = 0.20;
        }
        return beverage.cost() + plusCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }
}
