package me.seungmoo.designpattern.headfirst.ch01.simuduck.ducks;

import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.fly.FlyNoWay;
import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super(new FlyNoWay(), new Quack(), ModelDuck.class.getName());
    }
}
