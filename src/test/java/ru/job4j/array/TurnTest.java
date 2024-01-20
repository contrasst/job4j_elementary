package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 3, 5, 7, 9};
        int[] result = Turn.back(input);
        int[] expected = new int[] {9, 7, 5, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWith0ddAmountOffElementsThenTUrnedArray() {
        int[] input = new int[] {3, 7, 9, 11, 13};
        int[] result = Turn.back(input);
        int[] expected = new int[] {13, 11, 9, 7, 3};
        assertThat(result).containsExactly(expected);
    }

}