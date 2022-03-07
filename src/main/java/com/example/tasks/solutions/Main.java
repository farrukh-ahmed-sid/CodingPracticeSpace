package com.example.tasks.solutions;


import static com.example.tasks.solutions.amazon.hackerrank.ShortestReachInGraph.shortestReachInGraph;

public class Main {
    public static void main(String[] args) {

        String[][] arr = {
                {"_", "_", "_", "_", "_", "_"},
                {"_", "A", "b", "_", "_", "_"},
                {"_", "_", "b", ">", "_", "_"},
                {"_", "_", "_", "b", "_", "_"},
                {"_", "_", "_", "_", "_", "_"},
                {"_", "_", "b", "_", "^", "_"},
        };
        shortestReachInGraph();
        //System.out.println(guardAndAssassin(arr));
    }
}
