package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int i = 0; i < 2; i++) {
            if (word[word.length - 1] == post[post.length - 1] && word[word.length - 1 - i] == post[post.length - 1 - i]) {
                result = true;
                break;
            }
        }
        return result;
    }
}