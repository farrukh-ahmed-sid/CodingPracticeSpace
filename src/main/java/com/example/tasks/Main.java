package com.example.tasks;


import com.example.tasks.solutions.graphs.GraphBase;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        GraphBase graphBase = new GraphBase();

        Map<String, String> map = graphBase.getAdjacencyListFromUndirectedGraph(graphBase.initialize());


        System.out.println(map);

    }


}



