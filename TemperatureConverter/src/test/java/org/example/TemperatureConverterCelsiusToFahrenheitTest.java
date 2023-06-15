package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterCelsiusToFahrenheitTest {

    @Test
    public void TemperatureConvert_shouldReturnCorrectValueTest() {
        // Given
        TemperatureConverter converter = new TemperatureConverterCelsiusToFahrenheit();
        double givenCelsiusTemperature = 10.0;
        double expectedFahrenheitTemperature = (10.0 * 9 / 5) + 32;

        // When
        double actualFahrenheitTemperature = converter.temperatureConvert(givenCelsiusTemperature);

        // Then
        assertEquals(expectedFahrenheitTemperature, actualFahrenheitTemperature, 0.001);
    }

    @Test
    public void temperatureConvert_shouldReturnNegativeValueTest() {
        // Given
        TemperatureConverter converter = new TemperatureConverterCelsiusToFahrenheit();
        double givenCelsiusTemperature = -50.0;
        double expectedFahrenheitTemperature = (-50.0 * 9 / 5) + 32;

        // When
        double actualCelsiusTemperature = converter.temperatureConvert(givenCelsiusTemperature);

        // Then
        assertEquals(expectedFahrenheitTemperature, actualCelsiusTemperature, 0.001);
    }

}

