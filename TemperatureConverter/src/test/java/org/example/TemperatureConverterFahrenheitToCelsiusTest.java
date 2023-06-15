package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterFahrenheitToCelsiusTest {

    @Test
    public void temperatureConvert_shouldReturnCorrectValueTest() {
        // Given
        TemperatureConverter converter = new TemperatureConverterFahrenheitToCelsius();
        double fahrenheitTemperature = 50.0;
        double expectedCelsiusTemperature = (50 - 32) * 5 / 9;

        // When
        double actualCelsiusTemperature = converter.temperatureConvert(fahrenheitTemperature);

        // Then
        assertEquals(expectedCelsiusTemperature, actualCelsiusTemperature, 0.001);
    }


    @Test
    public void temperatureConvert_shouldReturnNegativeValueTest() {
        // Given
        TemperatureConverter converter = new TemperatureConverterFahrenheitToCelsius();
        double fahrenheitTemperature = -4.0;
        double expectedCelsiusTemperature = (-4.0 - 32) * 5 / 9;

        // When
        double actualCelsiusTemperature = converter.temperatureConvert(fahrenheitTemperature);

        // Then
        assertEquals(expectedCelsiusTemperature, actualCelsiusTemperature, 0.001);
    }
}