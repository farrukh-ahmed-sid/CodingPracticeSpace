package com.example.tasks.designPatterns.strategyPattern;

public class BubbleSortStrategy implements SortArrayStrategy {


    @Override
    public void sort(int[] arr) {
        System.out.println("bubble sort arr");
    }
}
