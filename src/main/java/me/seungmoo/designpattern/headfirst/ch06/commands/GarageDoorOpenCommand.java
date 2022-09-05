package me.seungmoo.designpattern.headfirst.ch06.commands;

import me.seungmoo.designpattern.headfirst.ch06.receivers.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
