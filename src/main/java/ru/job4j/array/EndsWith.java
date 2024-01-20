package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        if (word.length < postfix.length) {
            return false;
        }
        for (int i = 0; i < postfix.length; i++) {
            if (word[word.length - i - 1] != postfix[postfix.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
