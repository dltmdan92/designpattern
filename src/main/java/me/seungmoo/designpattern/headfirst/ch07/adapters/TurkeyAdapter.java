package me.seungmoo.designpattern.headfirst.ch07.adapters;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch07.fowls.Duck;
import me.seungmoo.designpattern.headfirst.ch07.fowls.Turkey;

@RequiredArgsConstructor
public class TurkeyAdapter implements Duck {
    private final Turkey turkey;

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
