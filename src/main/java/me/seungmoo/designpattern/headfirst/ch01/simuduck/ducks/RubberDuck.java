package me.seungmoo.designpattern.headfirst.ch01.simuduck.ducks;

import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.fly.FlyNoWay;
import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.quack.Quack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new Quack(), DecoyDuck.class.getName());
    }
}