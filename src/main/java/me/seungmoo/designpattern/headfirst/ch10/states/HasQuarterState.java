package me.seungmoo.designpattern.headfirst.ch10.states;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch10.GumballMachine;

/**
 * 동전 있음
 */
@RequiredArgsConstructor
public class HasQuarterState implements State {
    private final GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {
        System.out.println("동전은 한 개만 넣어 주세요.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전이 반환됩니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌리셨습니다.");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }
}
