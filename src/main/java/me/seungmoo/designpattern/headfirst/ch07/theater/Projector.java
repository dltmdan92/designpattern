package me.seungmoo.designpattern.headfirst.ch07.theater;

import lombok.Setter;

@Setter
public class Projector {
    private StreamingPlayer player;

    public void on() {}
    public void off() {}
    public void tvMode() {}
    public void wideScreenMode() {}
    public String toString() {
        return null;
    }
}
