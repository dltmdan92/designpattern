package me.seungmoo.designpattern.headfirst.ch06.invokers;

import me.seungmoo.designpattern.headfirst.ch06.commands.GarageDoorOpenCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.LightOnCommand;
import me.seungmoo.designpattern.headfirst.ch06.receivers.GarageDoor;
import me.seungmoo.designpattern.headfirst.ch06.receivers.Light;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimpleRemoteControllerTest {

    @Test
    @DisplayName("light on test")
    void simpleTest() {
        SimpleRemoteController remoteController = new SimpleRemoteController();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteController.setCommand(lightOnCommand);
        remoteController.buttonWasPressed();
    }

    @Test
    @DisplayName("light on & garage door open test")
    void lightOnAndGarageDoorOpenTest() {
        SimpleRemoteController remoteController = new SimpleRemoteController();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remoteController.setCommand(lightOnCommand);
        remoteController.buttonWasPressed();
        remoteController.setCommand(garageDoorOpenCommand);
        remoteController.buttonWasPressed();
    }

}