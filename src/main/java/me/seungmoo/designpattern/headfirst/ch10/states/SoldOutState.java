package me.seungmoo.designpattern.headfirst.ch10.states;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch10.GumballMachine;

/**
 * 뽑기알 다 나감
 */
@RequiredArgsConstructor
public class SoldOutState implements State {
    private final GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {
        System.out.println("매진입니다. 동전 못 넣습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("매진입니다. 동전 없습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진입니다. 못 돌립니다.");
    }

    @Override
    public void dispense() {
        System.out.println("매진입니다. 알맹이를 내보낼 수 없습니다.");
    }

    @Override
    public void refill() {
        System.out.println("알맹이 리필합니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
