package me.seungmoo.designpattern.headfirst.ch01.simuduck.ducks;

import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.fly.FlyNoWay;
import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new FlyNoWay(), new MuteQuack(), DecoyDuck.class.getName());
    }
}
