package me.seungmoo.designpattern.headfirst.ch06.invokers;

import me.seungmoo.designpattern.headfirst.ch06.commands.garage.GarageDoorDownCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.garage.GarageDoorUpCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.light.LightOffCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.light.LightOnCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.stereo.StereoOffCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.stereo.StereoOnWithCDCommand;
import me.seungmoo.designpattern.headfirst.ch06.receivers.GarageDoor;
import me.seungmoo.designpattern.headfirst.ch06.receivers.Light;
import me.seungmoo.designpattern.headfirst.ch06.receivers.Stereo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}
