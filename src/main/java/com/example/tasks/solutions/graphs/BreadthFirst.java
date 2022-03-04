package com.example.tasks.solutions.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BreadthFirst {


    public static void breadthFirst(Map<String, String> map, String current) {
        Queue<String> queue = new LinkedList<>();
        queue.add(current);

        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.println(current);

            if (map.get(current).contains(",")) {
                String[] arr = map.get(current).split(",");
                queue.addAll(Arrays.asList(arr));

            } else if (!map.get(current).isEmpty()) {
                queue.add(map.get(current));
            }

        }

    }
}
