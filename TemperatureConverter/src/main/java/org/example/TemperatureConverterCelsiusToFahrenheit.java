package org.example;

public class TemperatureConverterCelsiusToFahrenheit implements TemperatureConverter {
    @Override
    public double temperatureConvert(double temperature) {
        return (temperature * 9 / 5) + 32;
    }
}