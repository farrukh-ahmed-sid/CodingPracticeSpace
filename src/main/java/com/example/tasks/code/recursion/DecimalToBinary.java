package com.example.tasks.code.recursion;

// 11101001 for 233
public class DecimalToBinary {

    String result = "";

    public String decimalToBinary(int val) {

        if (val == 0) {
            if (result.isBlank()) {
                return String.valueOf(val);
            }
            return result;
        }
        result = val % 2 + result;
        return decimalToBinary(val / 2);
    }
}
