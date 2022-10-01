package me.seungmoo.designpattern.headfirst.ch10.states;

/**
 * 동전 없음
 */
public class NoQuarterState implements State {
    @Override
    public void insertQuarter() {
        // TODO HAS_QUARTER로 전환
    }

    @Override
    public void ejectQuarter() {
        // TODO 동전을 넣어달라는 메시지 출력
    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
