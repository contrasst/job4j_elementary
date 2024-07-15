package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then3() {
        int left = 1;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1And2Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1And2And3Then8() {
        int first = 4;
        int second = 2;
        int third = 8;
        int result = Max.max(first, Max.max(second, third));
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1And12nAnd3Then12() {
        int first = 1;
        int second = 12;
        int third = 5;
        int result = Max.max(first, Max.max(second, third));
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2And3And5And4Then5() {
        int first = 2;
        int second = 3;
        int third = 5;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}