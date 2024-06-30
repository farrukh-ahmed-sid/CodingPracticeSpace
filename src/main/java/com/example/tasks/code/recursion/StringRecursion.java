package com.example.tasks.code.recursion;

public class StringRecursion {

    public String reverseString(String str) {

        if (str.length() < 2) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
    //straight and reverse same
    public boolean palindrome(String str) {
        if (str.length() < 2) {
            return true;
        } else if(str.charAt(str.length() - 1) == str.charAt(0) ) {
            return palindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }
}
