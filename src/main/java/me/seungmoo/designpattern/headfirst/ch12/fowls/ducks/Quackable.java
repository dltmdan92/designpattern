package me.seungmoo.designpattern.headfirst.ch12.fowls.ducks;

import me.seungmoo.designpattern.headfirst.ch12.observers.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
