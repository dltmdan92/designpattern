package me.seungmoo.designpattern.headfirst.ch07.adapters;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch07.fowls.Duck;
import me.seungmoo.designpattern.headfirst.ch07.fowls.Turkey;

@RequiredArgsConstructor
public class DuckAdapter implements Turkey {
    private final Duck duck;

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
