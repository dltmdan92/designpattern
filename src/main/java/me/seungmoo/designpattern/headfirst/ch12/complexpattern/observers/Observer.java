package me.seungmoo.designpattern.headfirst.ch12.complexpattern.observers;

import me.seungmoo.designpattern.headfirst.ch12.complexpattern.fowls.ducks.Quackable;

public interface Observer {
    void update(Quackable duck);
}
