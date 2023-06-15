package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterCelsiusToKelvinTest {

    @Test
    public void TemperatureConvert_shouldReturnCorrectValueTest() {
        // Given
        TemperatureConverter converter = new TemperatureConverterCelsiusToKelvin();
        double givenCelsiusTemperature = 10.0;
        double expectedKelvinTemperature = 10.0 + 273.15;

        // When
        double actualKelvinTemperature = converter.temperatureConvert(givenCelsiusTemperature);

        // Then
        assertEquals(expectedKelvinTemperature, actualKelvinTemperature, 0.001);
    }

    @Test
    public void temperatureConvert_shouldReturnNegativeValueTest() {
        // Given
        TemperatureConverter converter = new TemperatureConverterCelsiusToKelvin();
        double givenCelsiusTemperature = -300.0;
        double expectedKelvinTemperature = -300.0 + 273.15;

        // When
        double actualKelvinTemperature = converter.temperatureConvert(givenCelsiusTemperature);

        // Then
        assertEquals(expectedKelvinTemperature, actualKelvinTemperature, 0.001);
    }
}

