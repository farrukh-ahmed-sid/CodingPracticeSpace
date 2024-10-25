package com.example.tasks.designPatterns.strategyPattern;

public class Run {

    public static void main(String[] args) {
        SortArrayStrategy sortArrayStrategy = new BubbleSortStrategy();
        SortArrayContext context = new SortArrayContext(sortArrayStrategy);

        int[] arr = {4, 1, 5, 6, 3};

        context.sort(arr);

        context.setSortArrayStrategy(new SelectionSortStrategy());

        context.sort(arr);
    }
}
