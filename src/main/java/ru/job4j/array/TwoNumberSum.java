package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (target == array[i] + array[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
}
