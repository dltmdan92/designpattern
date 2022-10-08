package me.seungmoo.designpattern.headfirst.ch12.factories;

import me.seungmoo.designpattern.headfirst.ch12.fowls.ducks.Quackable;

/**
 * 추상 팩토리 패턴
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
