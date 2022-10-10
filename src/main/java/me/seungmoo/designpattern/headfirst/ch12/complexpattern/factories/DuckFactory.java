package me.seungmoo.designpattern.headfirst.ch12.complexpattern.factories;

import me.seungmoo.designpattern.headfirst.ch12.complexpattern.fowls.ducks.*;
import me.seungmoo.designpattern.headfirst.ch12.fowls.ducks.*;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
