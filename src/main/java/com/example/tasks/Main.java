package com.example.tasks;


import com.example.tasks.solutions.graphs.ShortestPathWeightedGraph;

public class Main {

    public static void main(String[] args) {

        ShortestPathWeightedGraph weightedGraph = new ShortestPathWeightedGraph();
        System.out.println(weightedGraph.shortestPath(weightedGraph.initializeDirectionalGraph(), "a", "d"));

    }

}



