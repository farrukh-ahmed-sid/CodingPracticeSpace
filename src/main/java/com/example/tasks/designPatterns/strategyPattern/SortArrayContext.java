package com.example.tasks.designPatterns.strategyPattern;

public class SortArrayContext {
    private SortArrayStrategy sortArrayStrategy;

    public SortArrayContext(SortArrayStrategy sortArrayStrategy) {
        this.sortArrayStrategy = sortArrayStrategy;
    }

    public void setSortArrayStrategy(SortArrayStrategy strategy){
        this.sortArrayStrategy = strategy;
    }

    public void sort(int[] arr){
        sortArrayStrategy.sort(arr);
    }

}
