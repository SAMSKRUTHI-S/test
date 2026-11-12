package com.example.tempe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    // Test Celsius to Fahrenheit
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(212.0,
            TemperatureConverter.celsiusToFahrenheit(100), 0.001);
    }

    // Test Fahrenheit to Celsius
    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0,
            TemperatureConverter.fahrenheitToCelsius(32), 0.001);
    }

    // Test Celsius to Kelvin
    @Test
    public void testCelsiusToKelvin() {
        assertEquals(373.15,
            TemperatureConverter.celsiusToKelvin(100), 0.001);
    }

    // Test Kelvin to Celsius
    @Test
    public void testKelvinToCelsius() {
        assertEquals(0.0,
            TemperatureConverter.kelvinToCelsius(273.15), 0.001);
    }

    // Test Fahrenheit to Kelvin
    @Test
    public void testFahrenheitToKelvin() {
        assertEquals(273.15,
            TemperatureConverter.fahrenheitToKelvin(32), 0.001);
    }

    // Test Kelvin to Fahrenheit
    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(32.0,
            TemperatureConverter.kelvinToFahrenheit(273.15), 0.001);
    }

    // Test invalid Celsius value
    @Test
    public void testInvalidCelsius() {
        assertThrows(IllegalArgumentException.class,
            () -> TemperatureConverter.celsiusToFahrenheit(-300));
    }

    // Test invalid Fahrenheit value
    @Test
    public void testInvalidFahrenheit() {
        assertThrows(IllegalArgumentException.class,
            () -> TemperatureConverter.fahrenheitToCelsius(-500));
    }

    // Test invalid Kelvin value
    @Test
    public void testInvalidKelvin() {
        assertThrows(IllegalArgumentException.class,
            () -> TemperatureConverter.kelvinToCelsius(-10));
    }

    // Test NaN input
    @Test
    public void testNaNInput() {
        assertThrows(IllegalArgumentException.class,
            () -> TemperatureConverter.celsiusToKelvin(Double.NaN));
    }

    // Test infinite input
    @Test
    public void testInfiniteInput() {
        assertThrows(IllegalArgumentException.class,
            () -> TemperatureConverter.kelvinToFahrenheit(
                Double.POSITIVE_INFINITY));
    }
}



