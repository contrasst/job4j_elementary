package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert200RblThen3dot3333euro() {
        float in = 233.1f;
        float expected = 3.33f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out  = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

}