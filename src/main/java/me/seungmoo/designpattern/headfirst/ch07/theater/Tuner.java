package me.seungmoo.designpattern.headfirst.ch07.theater;

import lombok.Setter;

@Setter
public class Tuner {
    private Amplifier amplifier;

    public void on() {}
    public void off() {}
    public void setAm() {}
    public void setFm() {}
    public void setFrequency() {}
    public String toString() {
        return null;
    }
}
