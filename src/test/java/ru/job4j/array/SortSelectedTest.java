package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    void sortBiggerNegativeNumbersArray() {
        int[] input = {-4, -2, -3, -11, -8};
        int[] result = SortSelected.sort(input);
        int[] expected = {-11, -8, -4, -3, -2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void sortBiggerRandomPositiveNumbersArray() {
        int[] input = {12, 23, 32, 14, 15};
        int[] result = SortSelected.sort(input);
        int[] expected = {12, 14, 15, 23, 32};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void sortBiggerRandomNegativeAndPositiveNumberArray() {
        int[] input = {-23, 12, 17, -9, 15};
        int[] result = SortSelected.sort(input);
        int[] expected = {-23, -9, 12, 15, 17};
        assertThat(result).containsExactly(expected);
    }
}