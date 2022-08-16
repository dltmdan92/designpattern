package me.seungmoo.designpattern.headfirst.ch02;

import me.seungmoo.designpattern.headfirst.ch02.displays.Display;

public class WeatherDataBeforeObserverPattern {

    private Display currenConditionsDisplay;
    private Display statisticsDisplay;
    private Display forecastDisplay;

    public float getTemperature() {
        return 0.0f;
    }

    public float getHumidity() {
        return 0.0f;
    }

    public float getPressure() {
        return 0.0f;
    }

    public void measurementsChanged() {
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        // 이 부분은 코드 변화가 있을 수 있으므로 캡슐화해야한다.
        currenConditionsDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }

}
