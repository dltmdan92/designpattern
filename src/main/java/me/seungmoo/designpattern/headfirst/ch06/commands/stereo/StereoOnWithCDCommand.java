package me.seungmoo.designpattern.headfirst.ch06.commands.stereo;

import me.seungmoo.designpattern.headfirst.ch06.commands.Command;
import me.seungmoo.designpattern.headfirst.ch06.receivers.Stereo;

public class StereoOnWithCDCommand implements Command {
    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
