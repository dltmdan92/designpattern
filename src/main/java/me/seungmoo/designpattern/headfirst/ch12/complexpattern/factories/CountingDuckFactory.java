package me.seungmoo.designpattern.headfirst.ch12.complexpattern.factories;

import me.seungmoo.designpattern.headfirst.ch12.complexpattern.decorators.QuackCountDecorator;
import me.seungmoo.designpattern.headfirst.ch12.complexpattern.fowls.ducks.*;
import me.seungmoo.designpattern.headfirst.ch12.fowls.ducks.*;

public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCountDecorator(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCountDecorator(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCountDecorator(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCountDecorator(new RubberDuck());
    }
}
