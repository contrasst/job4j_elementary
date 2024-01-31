package ru.job4j.condition;

import org.assertj.core.error.ShouldHaveSizeGreaterThanOrEqualTo;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expectedDistance = 2.0;
        double actualDistance = a.distance(b);
        assertThat(actualDistance).isEqualTo(expectedDistance);
    }

    @Test
    void when00To30Then3() {
       Point a = new Point(0, 0);
       Point b = new Point(0, 2);
       double expected = 2.0;
       double out = a.distance(b);
       assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10To10Then0() {
        Point a = new Point(1, 0);
        Point b = new Point(1, 0);
        double expected = 0.0;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10To01Then1dot41() {
        Point a = new Point(1, 0);
        Point b = new Point(0, 1);
        double expected = 1.41;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

}