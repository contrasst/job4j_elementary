package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart2Finish6Then20() {
        int expected = 20;
        int start = 2;
        int finish = 6;
        int out = Counter.sum(start, finish);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenStart5Finish12Then68() {
        int expected = 68;
        int start = 5;
        int finish = 12;
        int out = Counter.sum(start, finish);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenStart6Finish5Then0() {
        int expected = 0;
        int start = 6;
        int finish = 5;
        int out = Counter.sum(start, finish);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromFiveToNineThenFourTeen() {
        int start = 5;
        int finish = 9;
        int result = Counter.sumByEven(start, finish);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }
}