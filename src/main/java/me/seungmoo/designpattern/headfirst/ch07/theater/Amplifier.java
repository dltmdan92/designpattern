package me.seungmoo.designpattern.headfirst.ch07.theater;

import lombok.Setter;

@Setter
public class Amplifier {
    private Tuner tuner;
    private StreamingPlayer player;
    private int volume;

    public void on() {}
    public void off() {}

    public void setStereoSound() {}
    public void setSurroundSound() {}
    public void setTuner() {}
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String toString() {
        return null;
    }
}
