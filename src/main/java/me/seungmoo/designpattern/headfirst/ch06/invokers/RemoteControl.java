package me.seungmoo.designpattern.headfirst.ch06.invokers;

import me.seungmoo.designpattern.headfirst.ch06.commands.Command;
import me.seungmoo.designpattern.headfirst.ch06.commands.NoCommand;

public class RemoteControl {
    private final Command[] onCommands = new Command[7];
    private final Command[] offCommands = new Command[7];
    private Command undoCommand;

    public RemoteControl() {
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ 리모컨 ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot ").append(i).append("]").append(onCommands[i].getClass().getSimpleName()).append("      ").append(offCommands[i].getClass().getSimpleName()).append("\n");
        }
        return stringBuilder.toString();
    }
}
