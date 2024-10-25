package com.example.tasks.designPatterns.strategyPattern;

public class SelectionSortStrategy implements SortArrayStrategy {
    @Override
    public void sort(int[] arr) {
        System.out.println("Selection sort arr");
    }
}
