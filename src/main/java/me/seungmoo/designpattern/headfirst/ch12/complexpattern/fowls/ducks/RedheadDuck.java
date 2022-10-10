package me.seungmoo.designpattern.headfirst.ch12.complexpattern.fowls.ducks;

import me.seungmoo.designpattern.headfirst.ch12.complexpattern.observers.Observable;
import me.seungmoo.designpattern.headfirst.ch12.complexpattern.observers.Observer;

public class RedheadDuck implements Quackable {
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
