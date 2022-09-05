package me.seungmoo.designpattern.headfirst.ch06.invokers;

import me.seungmoo.designpattern.headfirst.ch06.commands.Command;

public class SimpleRemoteController extends Invoker {
    Command slot;

    public SimpleRemoteController() {}

    public void buttonWasPressed() {
        slot.execute();
    }
}
