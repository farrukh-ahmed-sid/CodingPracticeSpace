package com.example.tasks.solutions;


import com.example.tasks.solutions.graphs.BreadthFirst;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        BreadthFirst breadthFirst = new BreadthFirst();

        Map<String, String> map = breadthFirst.initialize();
        breadthFirst.breadthFirst(map, "a");

    }

}


