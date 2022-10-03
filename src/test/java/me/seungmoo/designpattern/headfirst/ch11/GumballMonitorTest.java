package me.seungmoo.designpattern.headfirst.ch11;

import me.seungmoo.designpattern.headfirst.ch10.GumballMachine;
import me.seungmoo.designpattern.headfirst.ch11.gumball.GumballMonitor;
import org.junit.jupiter.api.Test;

import java.rmi.RemoteException;

class GumballMonitorTest {

    @Test
    void test() throws RemoteException {
        String location = "Austin";
        int count = 112;

        GumballMachine machine = new GumballMachine(location, count);
        GumballMonitor monitor = new GumballMonitor(machine);
        monitor.report();
    }

}