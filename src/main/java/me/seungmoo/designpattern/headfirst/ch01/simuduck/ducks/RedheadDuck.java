package me.seungmoo.designpattern.headfirst.ch01.simuduck.ducks;

import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.fly.FlyWithWings;
import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super(new FlyWithWings(), new Quack(), DecoyDuck.class.getName());
    }
}