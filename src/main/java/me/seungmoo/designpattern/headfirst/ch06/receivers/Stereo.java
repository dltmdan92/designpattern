package me.seungmoo.designpattern.headfirst.ch06.receivers;

public class Stereo {
    private final String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " stereo on");
    }
    public void setCD() {
        System.out.println(name + " stereo set CD");
    }
    public void setVolume(int volume) {
        System.out.println(name + " stereo volume " + volume);
    }

    public void off() {
        System.out.println(name + " stereo off");
    }
    public void extractCD() {
        System.out.println(name + " stereo extract CD");
    }
}
