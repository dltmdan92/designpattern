package me.seungmoo.designpattern.headfirst.ch11;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch10.GumballMachine;

@RequiredArgsConstructor
public class GumballMonitor {
    private final GumballMachine machine;

    public void report() {
        System.out.println("뽑기 기계 위치: " + machine.getLocation());
        System.out.println("현재 재고: " + machine.getCount() + " 개");
        System.out.println("현재 상태: " + machine.getState());
    }
}
