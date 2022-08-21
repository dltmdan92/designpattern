package me.seungmoo.designpattern.headfirst.ch02.example.observers.display;

import me.seungmoo.designpattern.headfirst.ch02.example.observers.Observer;
import me.seungmoo.designpattern.headfirst.ch02.example.subjects.weather.WeatherData;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class StatisticsDisplay implements Observer, DisplayElement {
    private final Queue<Float> temperatures = new LinkedList<>();
    private Optional<Float> minTemp = Optional.empty();
    private Optional<Float> maxTemp = Optional.empty();
    private float avgTemp;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        setTemps(temperature);
        display();
    }

    private void setTemps(float temperature) {
        addTemp(temperature);
        setMinTemp(temperature);
        setMaxTemp(temperature);
        setAvgTemp();
    }

    private void addTemp(float temperature) {
        temperatures.add(temperature);
        if (temperatures.size() > 10) {
            temperatures.poll();
        }
    }

    private void setMinTemp(float temperature) {
        if (this.minTemp.isEmpty()) {
            this.minTemp = Optional.of(temperature);
        } else {
            exchangeMinTemp(temperature);
        }
    }

    private void exchangeMinTemp(float temperature) {
        if (this.minTemp.get() > temperature) {
            this.minTemp = Optional.of(temperature);
        }
    }

    private void setMaxTemp(float temperature) {
        if (this.maxTemp.isEmpty()) {
            this.maxTemp = Optional.of(temperature);
        } else {
            exchangeMaxTemp(temperature);
        }
    }

    private void exchangeMaxTemp(float temperature) {
        if (this.maxTemp.get() < temperature) {
            this.maxTemp = Optional.of(temperature);
        }
    }

    private void setAvgTemp() {
        Optional<Float> sum = this.temperatures.stream().reduce(Float::sum);
        sum.ifPresent(x -> this.avgTemp = x / this.temperatures.size());
    }

    @Override
    public void display() {
        System.out.println("평균/최고/최저 온도 = " + avgTemp + "/" + maxTemp.orElse(0.0f) + "/" + minTemp.orElse(0.0f));
    }
}
