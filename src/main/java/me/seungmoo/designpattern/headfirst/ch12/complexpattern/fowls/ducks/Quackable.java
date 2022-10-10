package me.seungmoo.designpattern.headfirst.ch12.complexpattern.fowls.ducks;

import me.seungmoo.designpattern.headfirst.ch12.complexpattern.observers.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
