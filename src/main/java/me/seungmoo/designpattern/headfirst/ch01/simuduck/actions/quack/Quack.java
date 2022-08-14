package me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
