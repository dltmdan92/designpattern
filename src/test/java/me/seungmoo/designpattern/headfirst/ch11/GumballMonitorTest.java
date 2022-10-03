package me.seungmoo.designpattern.headfirst.ch11;

import me.seungmoo.designpattern.headfirst.ch10.GumballMachine;
import org.junit.jupiter.api.Test;

class GumballMonitorTest {

    @Test
    void test() {
        String location = "Austin";
        int count = 112;

        GumballMachine machine = new GumballMachine(location, count);
        GumballMonitor monitor = new GumballMonitor(machine);
        monitor.report();
    }

}