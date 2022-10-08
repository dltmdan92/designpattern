package me.seungmoo.designpattern.headfirst.ch12.fowls.ducks;

import me.seungmoo.designpattern.headfirst.ch12.observers.Observable;
import me.seungmoo.designpattern.headfirst.ch12.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 객체들로 구성된 "컬렉션"을 "개별 객체"와 같은 방식으로 다룰 수 있게 해주는 컴포지트 패턴(Composite pattern)
 */
public class Flock implements Quackable{
    private final List<Quackable> quackers = new ArrayList<>();
    private Observable observable = new Observable(this);

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    /**
     * 또한 반복자 패턴이 적용되었다.
     */
    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
            notifyObservers();
        }
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
