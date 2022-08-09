package com.example.tasks.solutions.recursion;

public class DecimalToBinary {

    String result = "";

    public String decimalToBinary(int val) {

        if (val == 0) {
            return "0";
        } else if (val == 1) {
            return "1";
        } else {
            result = val % 2 + result;

            int nextVal = val / 2;

            if (nextVal == 1) {
                result = nextVal + result;
            } else {
                decimalToBinary(nextVal);
            }
            return result;
        }
    }
}
