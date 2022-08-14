package me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
