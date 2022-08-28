package me.seungmoo.designpattern.headfirst.ch03.coffee.decorator;

import me.seungmoo.designpattern.headfirst.ch03.coffee.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        double plusCost = 0.0;
        switch (beverage.getSize()) {
            case TALL -> plusCost = 0.20;
            case GRANDE -> plusCost = 0.30;
            case VENTI -> plusCost = 0.40;
        }
        return beverage.cost() + plusCost;
    }
}
