package me.seungmoo.designpattern.headfirst.ch01.simuduck.ducks;

import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.fly.FlyWithWings;
import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyWithWings(), new Quack(), DecoyDuck.class.getName());
    }
}