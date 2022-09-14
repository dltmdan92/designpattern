package me.seungmoo.designpattern.headfirst.ch07.theater;

public class TheaterLights {
    private int lightDim = 0;

    public void on() {}
    public void off() {}
    public void dim(int lightDim) {
        this.lightDim = lightDim;
    }
    public String toString() {
        return "dim: " + lightDim;
    }
}
