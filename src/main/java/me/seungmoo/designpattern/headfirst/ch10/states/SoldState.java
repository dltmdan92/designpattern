package me.seungmoo.designpattern.headfirst.ch10.states;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch10.GumballMachine;

/**
 * 뽑음
 */
@RequiredArgsConstructor
public class SoldState implements State {
    private final GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려 주세요.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {
        System.out.println("아직 알맹이가 있습니다.");
    }
}
