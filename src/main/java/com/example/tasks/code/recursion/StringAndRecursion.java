package com.example.tasks.code.recursion;

import java.util.Set;

public class StringAndRecursion {

    public String reverseString(String str) {

        if (str.length() < 2) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    //straight and its reverse strings are same is called palindrome
    public boolean palindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.charAt(str.length() - 1))) {
            return palindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    // for 5 val = 1 + 2 + 3 + 4 + 5
    public int sumOfNaturalNumbers(int val) {

        if (val <= 1) {
            return val;
        }
        return val + sumOfNaturalNumbers(val - 1);
    }

    //remove duplicate characters from string
    public String removeDuplicateChars(String val) {

        char[] alphabets = new char[26];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < val.length(); i++) {

            char ch = val.charAt(i);
            int index = ch - 'a';

            if (alphabets[index] == 0) {
                alphabets[index] = ch;
                result.append(ch);
            }
        }
        return result.toString();
    }

    //print all subsequences of a string, 2^n complexity
    public void subsequences(String input, int index, String result) {

        if (index == input.length()) {
            System.out.println(result);
            return;
        }
        char currentChar = input.charAt(index);

        subsequences(input, index + 1, result + currentChar);

        subsequences(input, index + 1, result + '-'); // '-' used for debugging only

    }

    //print all unique subsequences of a string, 2^n complexity
    public void uniqueSubsequences(String input, int index, String result, Set<String> set) {

        if (index == input.length()) {
            if (!set.contains(result)) {
                System.out.println(result);
                set.add(result);
            }
            return;
        }
        char currentChar = input.charAt(index);

        uniqueSubsequences(input, index + 1, result + currentChar, set);

        uniqueSubsequences(input, index + 1, result, set);

    }

}
