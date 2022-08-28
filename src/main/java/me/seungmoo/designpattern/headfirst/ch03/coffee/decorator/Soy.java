package me.seungmoo.designpattern.headfirst.ch03.coffee.decorator;

import me.seungmoo.designpattern.headfirst.ch03.coffee.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        double plusCost = 0.0;
        switch (beverage.getSize()) {
            case TALL -> plusCost = 0.15;
            case GRANDE -> plusCost = 0.25;
            case VENTI -> plusCost = 0.30;
        }
        return beverage.cost() + plusCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
