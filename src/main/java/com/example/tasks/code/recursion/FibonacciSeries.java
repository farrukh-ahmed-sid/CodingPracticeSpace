package com.example.tasks.code.recursion;

public class FibonacciSeries {

    //val is number at index, Its exponential O(2^n).
    private int fibonacciSeriesRecursion(int val) {
        if (val <= 1) {
            return val;
        }
        return fibonacciSeriesRecursion(val - 1) + fibonacciSeriesRecursion(val - 2);
    }

    //val is number at index, Its linear O(n).
    private int fibonacciSeriesDynamicProgramming(int val) {
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

    public void printSeries() {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacciSeriesDynamicProgramming(i));
        }
    }
}
