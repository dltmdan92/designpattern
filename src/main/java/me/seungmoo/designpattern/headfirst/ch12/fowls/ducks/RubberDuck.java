package me.seungmoo.designpattern.headfirst.ch12.fowls.ducks;

import me.seungmoo.designpattern.headfirst.ch12.observers.Observable;
import me.seungmoo.designpattern.headfirst.ch12.observers.Observer;

public class RubberDuck implements Quackable {
    private Observable observable = new Observable(this);

    @Override
    public void quack() {
        System.out.println("삑삑");
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
