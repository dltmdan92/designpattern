package me.seungmoo.designpattern.headfirst.ch10.states;

/**
 * 뽑기알 다 나감
 */
public class SoldOutState implements State {
    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {
        // TODO 알맹이가 없다.
    }

    @Override
    public void dispense() {

    }
}
