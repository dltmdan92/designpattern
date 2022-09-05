package me.seungmoo.designpattern.headfirst.ch06.commands;

import me.seungmoo.designpattern.headfirst.ch06.receivers.Light;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }
}
