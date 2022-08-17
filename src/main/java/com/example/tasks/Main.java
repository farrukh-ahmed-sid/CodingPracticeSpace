package com.example.tasks;


import com.example.tasks.solutions.graphs.GraphBase;
import com.example.tasks.solutions.graphs.HasPathUndirectedGraph;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        GraphBase base = new GraphBase();

        HasPathUndirectedGraph undirectedGraph = new HasPathUndirectedGraph();
        Map<String, String> map = undirectedGraph.getAdjacencyListFromUndirectedGraph(base.initialize());

        int i = base.countConnectedGraph(map);
        System.out.println(i);
    }

}



