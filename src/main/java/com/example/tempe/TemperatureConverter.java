package com.example.tempe;

public class TemperatureConverter {



    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        validateTemperature(celsius, -273.15);
        return (celsius * 9 / 5) + 32;
    }

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        validateTemperature(fahrenheit, -459.67);
        return (fahrenheit - 32) * 5 / 9;
    }

    // Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        validateTemperature(celsius, -273.15);
        return celsius + 273.15;
    }

    // Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        validateTemperature(kelvin, 0);
        return kelvin - 273.15;
    }

    // Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        validateTemperature(fahrenheit, -459.67);
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        validateTemperature(kelvin, 0);
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    // Validate temperature values
    private static void validateTemperature(
            double temperature, double minimum) {

        if (!Double.isFinite(temperature) || temperature < minimum) {
            throw new IllegalArgumentException(
                    "Invalid temperature value");
        }
    }
}



