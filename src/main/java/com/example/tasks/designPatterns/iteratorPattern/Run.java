package com.example.tasks.designPatterns.iteratorPattern;

import java.util.List;

public class Run {

    public static void main(String[] args) {

        List<String> list = List.of("1", "2", "3", "4", "5");
        IteratorAggregator<String> iteratorAggregator = new StringListIteratorAggregator(list);
        Iterator<String> iterator = iteratorAggregator.createIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
