package com.example.tasks.designPatterns.iteratorPattern;

import java.util.List;

public class StringListIteratorAggregator implements IteratorAggregator<String> {

    List<String> list;

    public StringListIteratorAggregator(List<String> list) {
        this.list = list;
    }

    @Override
    public Iterator<String> createIterator() {
        return new StringListIterator(list);
    }
}
