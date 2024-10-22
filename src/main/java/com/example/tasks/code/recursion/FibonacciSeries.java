package com.example.tasks.code.recursion;

public class FibonacciSeries {

    //val is number at index, Its exponential O(2^n).
    public int fibRecursion(int val) {
        if (val <= 1) {
            return val;
        }
        return fibRecursion(val - 1) + fibRecursion(val - 2);
    }

    //val is number at index, Its linear O(n).
    public int fibIterative(int val) {
        if (val <= 1) {
            return val;
        }

        int first = 0;
        int second = 1;

        for (int i = 1; i < val; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }

        return second;
    }

    public int fibMemo(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);  // memorize result
        return memo[n];
    }
}
