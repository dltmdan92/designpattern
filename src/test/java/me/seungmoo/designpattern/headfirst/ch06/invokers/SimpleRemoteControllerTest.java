package me.seungmoo.designpattern.headfirst.ch06.invokers;

import me.seungmoo.designpattern.headfirst.ch06.commands.garage.GarageDoorUpCommand;
import me.seungmoo.designpattern.headfirst.ch06.commands.light.LightOnCommand;
import me.seungmoo.designpattern.headfirst.ch06.receivers.GarageDoor;
import me.seungmoo.designpattern.headfirst.ch06.receivers.Light;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimpleRemoteControllerTest {

    @Test
    @DisplayName("light on test")
    void simpleTest() {
        SimpleRemoteController remoteController = new SimpleRemoteController();
        Light light = new Light("simple");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteController.setCommand(lightOnCommand);
        remoteController.buttonWasPressed();
    }

    @Test
    @DisplayName("light on & garage door open test")
    void lightOnAndGarageDoorOpenTest() {
        SimpleRemoteController remoteController = new SimpleRemoteController();
        Light light = new Light("simple");
        GarageDoor garageDoor = new GarageDoor("simple");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);

        remoteController.setCommand(lightOnCommand);
        remoteController.buttonWasPressed();
        remoteController.setCommand(garageDoorUpCommand);
        remoteController.buttonWasPressed();
    }

}