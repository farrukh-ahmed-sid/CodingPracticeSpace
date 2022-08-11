package com.example.tasks.solutions.graphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BreadthFirst {

    public Map<String, String> initialize() {
        Map<String, String> graph = new HashMap<>();
        graph.put("a", "b,c");
        graph.put("b", "d");
        graph.put("c", "e");
        graph.put("d", "f");
        graph.put("e", null);
        graph.put("f", null);
        return graph;
    }

    public void breadthFirst(Map<String, String> map, String current) {
        Queue<String> queue = new LinkedList<>();
        queue.add(current);

        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.println(current);

            String str = map.get(current);

            if (str != null) {
                if (str.contains(",")) {
                    String[] strArr = str.split(",");
                    queue.addAll(Arrays.asList(strArr));
                } else {
                    queue.add(str);
                }
            }
        }
    }
}
