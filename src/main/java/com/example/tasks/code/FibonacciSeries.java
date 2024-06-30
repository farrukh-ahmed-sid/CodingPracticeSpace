package com.example.tasks.code;

public class FibonacciSeries {

    //n represent nth fib number. Its exponential O(2^n).
    public int fibonacciSeriesRecursion(int n) {
        return fib(n - 1);
    }

    private int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }

    //n represent nth fib number. Its linear O(n).
    public int fibonacciSeriesDynamicProgramming(int n) {
        if (n < 3) {
            return n-1;
        } else {
            int pre = 0;
            int next = 1;

            for (int i = 2; i < n; i++) {
                int temp = pre;
                pre = next;
                next = temp + next;
            }
            return next;
        }
    }
}
