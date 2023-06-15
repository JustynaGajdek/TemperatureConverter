package org.example;

public class TemperatureConverterFahrenheitToCelsius implements TemperatureConverter {
    @Override
    public double temperatureConvert(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
