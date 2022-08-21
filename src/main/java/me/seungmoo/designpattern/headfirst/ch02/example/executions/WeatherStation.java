package me.seungmoo.designpattern.headfirst.ch02.example.executions;

import me.seungmoo.designpattern.headfirst.ch02.example.observers.display.CurrentConditionsDisplay;
import me.seungmoo.designpattern.headfirst.ch02.example.observers.display.ForecastDisplay;
import me.seungmoo.designpattern.headfirst.ch02.example.observers.display.HeatIndexDisplay;
import me.seungmoo.designpattern.headfirst.ch02.example.observers.display.StatisticsDisplay;
import me.seungmoo.designpattern.headfirst.ch02.example.subjects.weather.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
