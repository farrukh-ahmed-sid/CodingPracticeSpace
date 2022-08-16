package com.example.tasks;


import com.example.tasks.solutions.graphs.WeightedGraph;

public class Main {

    public static void main(String[] args) {

        WeightedGraph weightedGraph = new WeightedGraph();
        System.out.println(weightedGraph.shortestPath(weightedGraph.initializeDirectionalGraph(), "a", "d"));

    }

}



