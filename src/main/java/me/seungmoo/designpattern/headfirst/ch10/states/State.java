package me.seungmoo.designpattern.headfirst.ch10.states;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();
}
