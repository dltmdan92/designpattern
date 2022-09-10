package me.seungmoo.designpattern.headfirst.ch06.commands.stereo;

import me.seungmoo.designpattern.headfirst.ch06.commands.Command;
import me.seungmoo.designpattern.headfirst.ch06.receivers.Stereo;

public class StereoOffCommand implements Command {
    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
