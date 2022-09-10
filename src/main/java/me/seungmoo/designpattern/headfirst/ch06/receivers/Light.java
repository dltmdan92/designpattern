package me.seungmoo.designpattern.headfirst.ch06.receivers;

public class Light {
    private final String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " light on");
    }
    public void off() {
        System.out.println(name + " light off");
    }
}
