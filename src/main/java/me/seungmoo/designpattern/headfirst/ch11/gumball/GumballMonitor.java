package me.seungmoo.designpattern.headfirst.ch11.gumball;

import lombok.RequiredArgsConstructor;

import java.rmi.RemoteException;

@RequiredArgsConstructor
public class GumballMonitor {
    private final GumballMachineRemote machine;

    public void report() {
        try {
            System.out.println("뽑기 기계 위치: " + machine.getLocation());
            System.out.println("현재 재고: " + machine.getCount() + " 개");
            System.out.println("현재 상태: " + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
