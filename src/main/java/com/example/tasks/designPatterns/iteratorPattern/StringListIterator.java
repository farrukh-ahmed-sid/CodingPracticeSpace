package com.example.tasks.designPatterns.iteratorPattern;

import java.util.List;
import java.util.NoSuchElementException;

public class StringListIterator implements Iterator<String> {

    int count = 0;
    List<String> list;

    public StringListIterator(List<String> list){
        this.list = list;
    }

    @Override
    public String next() {
        if (count >= list.size()) {
            throw new NoSuchElementException();
        }
        return list.get(count++);
    }

    @Override
    public boolean hasNext() {
        return count < list.size();
    }
}
