package me.seungmoo.designpattern.headfirst.ch06.receivers;

public class GarageDoor {
    private final String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + " garage up");
    }
    public void down() {
        System.out.println(name + " garage down");
    }
    public void stop() {
        System.out.println(name + " garage stop");
    }
    public void lightOn() {
        System.out.println(name + " garage light on");
    }
    public void lightOff() {
        System.out.println(name + " garage light off");
    }
}
