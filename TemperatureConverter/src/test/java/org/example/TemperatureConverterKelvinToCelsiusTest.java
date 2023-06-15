package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterKelvinToCelsiusTest {
    @Test
    public void TemperatureConvert_shouldReturnCorrectValueTest() {
        // Given
        TemperatureConverter converter = new TemperatureConverterKelvinToCelsius();
        double givenKelvinTemperature = 300.0;
        double expectedCelsiusTemperature = 300.0 - 273.15;

        // When
        double actualKelvinTemperature = converter.temperatureConvert(givenKelvinTemperature);

        // Then
        assertEquals(expectedCelsiusTemperature, actualKelvinTemperature, 0.001);
    }

    @Test
    public void temperatureConvert_shouldReturnNegativeValueTest() {
        // Given
        TemperatureConverter converter = new TemperatureConverterKelvinToCelsius();
        double givenKelvinTemperature = 50.0;
        double expectedCelsiusTemperature = 50.0 - 273.15;

        // When
        double actualKelvinTemperature = converter.temperatureConvert(givenKelvinTemperature);

        // Then
        assertEquals(expectedCelsiusTemperature, actualKelvinTemperature, 0.001);
    }
}
