package me.seungmoo.designpattern.headfirst.ch12.fowls.ducks;

import me.seungmoo.designpattern.headfirst.ch12.observers.Observable;
import me.seungmoo.designpattern.headfirst.ch12.observers.Observer;

public class MallardDuck implements Quackable {
    private Observable observable = new Observable(this);

    @Override
    public void quack() {
        System.out.println("꽥꽥");
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
