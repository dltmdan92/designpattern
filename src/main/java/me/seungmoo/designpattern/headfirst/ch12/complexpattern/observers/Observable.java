package me.seungmoo.designpattern.headfirst.ch12.complexpattern.observers;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch12.complexpattern.fowls.ducks.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiredArgsConstructor
public class Observable implements QuackObservable {
    private List<Observer> observers = new ArrayList<>();
    private final Quackable duck;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }
}
