package com.JUnit.temperatureconverter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);
    }
}
