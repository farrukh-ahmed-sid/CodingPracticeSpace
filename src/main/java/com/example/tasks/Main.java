package com.example.tasks;


import com.example.tasks.solutions.graphs.BiggestIsland;

public class Main {

    public static void main(String[] args) {

        BiggestIsland biggestIsland = new BiggestIsland();
        int i = biggestIsland.biggestIsland(biggestIsland.initialize());
        System.out.println(i);
    }

}



