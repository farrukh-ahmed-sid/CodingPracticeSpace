package com.example.tasks.code.recursion;

// 11101001 for 233
public class DecimalToBinary {

    String result = "";

    public String decimalToBinary(int val) {

        if (val <= 1) {
            return val + result;
        } else {
            result = val % 2 + result;
            return decimalToBinary(val / 2);
        }
    }
}
