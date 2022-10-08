package me.seungmoo.designpattern.headfirst.ch12.adapters;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch12.observers.Observer;
import me.seungmoo.designpattern.headfirst.ch12.fowls.ducks.Quackable;
import me.seungmoo.designpattern.headfirst.ch12.fowls.gooses.Goose;
import me.seungmoo.designpattern.headfirst.ch12.observers.Observable;

/**
 * 어댑터 패턴
 */
@RequiredArgsConstructor
public class GooseAdapter implements Quackable {
    private final Goose goose;
    private Observable observable = new Observable(this);

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
