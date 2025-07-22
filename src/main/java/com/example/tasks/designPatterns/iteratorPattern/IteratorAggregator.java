package com.example.tasks.designPatterns.iteratorPattern;

public interface IteratorAggregator<T> {
    Iterator<T> createIterator();
}
