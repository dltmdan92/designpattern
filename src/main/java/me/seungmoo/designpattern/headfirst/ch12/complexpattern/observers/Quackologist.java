package me.seungmoo.designpattern.headfirst.ch12.complexpattern.observers;

import me.seungmoo.designpattern.headfirst.ch12.complexpattern.fowls.ducks.Quackable;

public class Quackologist implements Observer{
    @Override
    public void update(Quackable duck) {
        System.out.println("꽥꽥학자: " + duck + " 가 방금 소리냈다.");
    }
}
