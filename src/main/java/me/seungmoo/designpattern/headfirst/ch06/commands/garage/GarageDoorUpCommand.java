package me.seungmoo.designpattern.headfirst.ch06.commands.garage;

import me.seungmoo.designpattern.headfirst.ch06.commands.Command;
import me.seungmoo.designpattern.headfirst.ch06.receivers.GarageDoor;

public class GarageDoorUpCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
