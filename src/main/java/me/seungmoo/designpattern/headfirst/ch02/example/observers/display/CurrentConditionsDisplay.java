package me.seungmoo.designpattern.headfirst.ch02.example.observers.display;

import me.seungmoo.designpattern.headfirst.ch02.example.observers.Observer;
import me.seungmoo.designpattern.headfirst.ch02.example.subjects.weather.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        // Subject를 주입받아서 객체에서 들고 있으면, 추후에 옵저버 목록에서 탈퇴할 때 편하다.
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
    }
}
