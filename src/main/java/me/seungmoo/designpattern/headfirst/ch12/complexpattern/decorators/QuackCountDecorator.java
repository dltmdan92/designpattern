package me.seungmoo.designpattern.headfirst.ch12.complexpattern.decorators;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch12.complexpattern.observers.Observer;
import me.seungmoo.designpattern.headfirst.ch12.complexpattern.fowls.ducks.Quackable;

@RequiredArgsConstructor
public class QuackCountDecorator implements Quackable {
    private static int numberOfQuacks;
    private final Quackable duck;

    @Override
    public void quack() {
        duck.quack();
        duck.notifyObservers();
        QuackCountDecorator.numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return QuackCountDecorator.numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
