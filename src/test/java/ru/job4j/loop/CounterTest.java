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

}