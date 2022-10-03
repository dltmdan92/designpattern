package me.seungmoo.designpattern.headfirst.ch11.gumball;

import me.seungmoo.designpattern.headfirst.ch10.states.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;
}
