package me.seungmoo.designpattern.headfirst.ch06.commands.macro;

import me.seungmoo.designpattern.headfirst.ch06.commands.Command;

public class MacroCommand implements Command {
    private final Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {

    }
}
