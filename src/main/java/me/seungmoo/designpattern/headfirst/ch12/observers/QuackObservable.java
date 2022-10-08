package me.seungmoo.designpattern.headfirst.ch12.observers;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
