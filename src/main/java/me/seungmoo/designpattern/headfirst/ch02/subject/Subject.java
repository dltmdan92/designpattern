package me.seungmoo.designpattern.headfirst.ch02.subject;

import me.seungmoo.designpattern.headfirst.ch02.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
