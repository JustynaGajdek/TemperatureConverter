package org.example;

public class TemperatureConverterKelvinToCelsius implements TemperatureConverter {
    @Override
    public double temperatureConvert(double temperature) {
        return temperature - 273.15;
    }
}