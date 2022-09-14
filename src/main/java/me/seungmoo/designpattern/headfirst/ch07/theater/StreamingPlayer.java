package me.seungmoo.designpattern.headfirst.ch07.theater;

import lombok.Setter;

@Setter
public class StreamingPlayer {
    private Amplifier amplifier;
    private String movie;

    public void on() {}
    public void off() {}
    public void pause() {}
    public void play(String movie) {
        this.movie = movie;
    }
    public void setSurroundAudio() {}
    public void setTwoChannelAudio() {}
    public void stop() {}
    public String toString() {
        return null;
    }
}
