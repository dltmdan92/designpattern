package me.seungmoo.designpattern.headfirst.ch10;

import lombok.Getter;
import lombok.ToString;
import me.seungmoo.designpattern.headfirst.ch10.states.*;
import me.seungmoo.designpattern.headfirst.ch11.gumball.GumballMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 상태패턴으로 구성된 뽑기 기계
 * 각각의 상태들은 composition으로 구성된다.
 *
 * 장점
 * 1. 각 상태의 행동을 별개의 클래스로 국지화했다.
 * 2. 관리하기 힘든 골칫덩어리 if 선언문들을 없앴다.
 * 3. 각 상태를 변경에는 닫혀 있게 하고, GumballMachine 클래스는 새로운 상태 클래스를 추가하는 확장에는 열려있다.(OCP)
 * 4. 코드가 더 편해졌다.
 *
 * 상태 패턴(State Pattern)을 통해 객체의 내부 상태가 바뀜에 따라서 객체의 행동을 바꿀 수 있다.
 */
@Getter
@ToString(onlyExplicitlyIncluded = true)
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private static final long serialVersionUID = 2L;
    private final String location;

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state;
    private int count = 0;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {
        this.location = location;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) {
            count--;
        }
    }

}
