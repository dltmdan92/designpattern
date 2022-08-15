package me.seungmoo.designpattern.headfirst.ch01.simuduck.ducks;

import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.fly.FlyBehavior;
import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.quack.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    private final String name;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, String name) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.name = name;
    }

    public void swim() {
        System.out.println("오리는 수영을 잘해요. 가짜 오리도 물에는 떠요.");
    }
    public void display() {
        System.out.println(this.name);
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
