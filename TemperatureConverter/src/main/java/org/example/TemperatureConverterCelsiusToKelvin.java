package org.example;

public class TemperatureConverterCelsiusToKelvin implements TemperatureConverter {
    @Override
    public double temperatureConvert(double temperature) {
        return temperature + 273.15;
    }
}
