package me.seungmoo.designpattern.headfirst.ch02.example.subjects.weather;

import lombok.Getter;
import me.seungmoo.designpattern.headfirst.ch02.example.observers.Observer;
import me.seungmoo.designpattern.headfirst.ch02.example.subjects.Subject;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WeatherData implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
