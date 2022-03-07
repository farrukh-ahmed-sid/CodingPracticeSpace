package com.example.tasks.solutions.zalando;

import java.util.Arrays;
import java.util.List;

public class RemoveLettersFromString {

    public static String solution(String input) {

        int size = input.length();
        List<String> lettersToBeRemove = Arrays.asList("AB", "BA", "CD", "DC");

        for (int i = 0; i < size - 1; i++) {

            for (String l : lettersToBeRemove) {
                if (input.contains(l)) {
                    input = removeString(input, l);
                }
            }
        }
        return input;
    }

    private static String removeString(String input, String sub) {
        input = input.replace(sub, " ").trim();

        if (input.contains(" ")) {
            String temp = input.substring(input.lastIndexOf(' ') + 1);
            input = input.substring(0, input.indexOf(' ')) + temp;
        }
        return input;
    }

}
