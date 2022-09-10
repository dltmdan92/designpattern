package me.seungmoo.designpattern.headfirst.ch06.commands.ceilingfan;

import me.seungmoo.designpattern.headfirst.ch06.commands.Command;
import me.seungmoo.designpattern.headfirst.ch06.receivers.CeilingFan;

import static me.seungmoo.designpattern.headfirst.ch06.receivers.CeilingFan.*;

public class CeilingFanMediumCommand implements Command {
    private final CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case HIGH -> ceilingFan.high();
            case MEDIUM -> ceilingFan.medium();
            case LOW -> ceilingFan.low();
            case OFF -> ceilingFan.off();
            default -> throw new IllegalStateException("Unexpected value: " + prevSpeed);
        }
    }
}
