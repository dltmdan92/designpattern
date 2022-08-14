package me.seungmoo.designpattern.headfirst.ch01.simuduck;

import me.seungmoo.designpattern.headfirst.ch01.simuduck.ducks.Duck;
import me.seungmoo.designpattern.headfirst.ch01.simuduck.ducks.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
