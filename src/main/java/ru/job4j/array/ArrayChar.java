package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for (int i = 0; i < 2; i++) {
            if (word[i] == pref[i] && word[i + 1] == pref[i + 1]) {
                result = true;
                break;
            }
        }
        return result;
    }
}