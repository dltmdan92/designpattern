package me.seungmoo.designpattern.headfirst.ch06.commands.garage;

import me.seungmoo.designpattern.headfirst.ch06.commands.Command;
import me.seungmoo.designpattern.headfirst.ch06.receivers.GarageDoor;

public class GarageDoorDownCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
