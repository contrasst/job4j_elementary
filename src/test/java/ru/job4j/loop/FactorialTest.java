package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int n = 5;
        int output = Factorial.calc(n);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int n = 0;
        int output = Factorial.calc(n);
        assertThat(output).isEqualTo(expected);
    }
}