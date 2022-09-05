package me.seungmoo.designpattern.headfirst.ch06.invokers;

import me.seungmoo.designpattern.headfirst.ch06.commands.Command;

public abstract class Invoker {
    protected Command slot;
    public void setCommand(Command command) {
        this.slot = command;
    }
}
