package me.seungmoo.designpattern.headfirst.ch02.example.subjects;

import me.seungmoo.designpattern.headfirst.ch02.example.observers.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
