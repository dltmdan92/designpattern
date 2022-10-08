package me.seungmoo.designpattern.headfirst.ch12.observers;

import me.seungmoo.designpattern.headfirst.ch12.fowls.ducks.Quackable;

public interface Observer {
    void update(Quackable duck);
}
