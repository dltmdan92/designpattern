package me.seungmoo.designpattern.headfirst.ch11.gumball;

import me.seungmoo.designpattern.headfirst.ch10.GumballMachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);

            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballMachine", gumballMachine);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
