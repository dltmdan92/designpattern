package me.seungmoo.designpattern.headfirst.ch10.states;

/**
 * 뽑음
 */
public class SoldState implements State {
    @Override
    public void insertQuarter() {
        // TODO 알맹이를 내보내고 있으니 기다려라 출력
    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        // TODO 알맹이를 하나 내보냄. 이때 알맹이 개수를 확인하고 그 값이 0보다 크면 NO_QUARTER, 0이면 SOLD_OUT으로 전환
    }
}
