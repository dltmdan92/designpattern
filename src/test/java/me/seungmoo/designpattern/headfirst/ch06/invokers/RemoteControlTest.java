package me.seungmoo.designpattern.headfirst.ch06.invokers;

import me.seungmoo.designpattern.headfirst.ch06.commands.Command;
import me.seungmoo.designpattern.headfirst.ch06.commands.ceilingfan.CeilingFanHighCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.ceilingfan.CeilingFanLowCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.ceilingfan.CeilingFanMediumCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.ceilingfan.CeilingFanOffCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.garage.GarageDoorDownCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.garage.GarageDoorUpCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.light.LightOffCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.light.LightOnCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.macro.MacroCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.stereo.StereoOffCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.stereo.StereoOnWithCDCommand;
import me.seungmoo.designpattern.headfirst.ch06.receivers.CeilingFan;
import me.seungmoo.designpattern.headfirst.ch06.receivers.GarageDoor;
import me.seungmoo.designpattern.headfirst.ch06.receivers.Light;
import me.seungmoo.designpattern.headfirst.ch06.receivers.Stereo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

class RemoteControlTest {

    @Test
    @DisplayName("remote controller test")
    void testRemoteController() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(3);
    }

    @Test
    @DisplayName("선풍기 테스트")
    void ceilingFanTest() {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl);
    }

    @Test
    @DisplayName("매크로 커맨드")
    void testMacroCommand() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        MacroCommand macroOnCommand = new MacroCommand(new Command[]{livingRoomLightOn, kitchenLightOn, garageDoorUp, stereoOnWithCD, ceilingFanMedium});
        MacroCommand macroOffCommand = new MacroCommand(new Command[]{livingRoomLightOff, kitchenLightOff, garageDoorDown, stereoOff, ceilingFanOff});

        remoteControl.setCommand(0, macroOnCommand, macroOffCommand);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
    }

}
