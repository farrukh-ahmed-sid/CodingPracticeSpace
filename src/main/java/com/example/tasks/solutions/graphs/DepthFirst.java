package com.example.tasks.solutions.graphs;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DepthFirst {

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

    public void depthFirst(Map<String, String> map, String current) {

        Stack<String> stack = new Stack<>();
        stack.push(current);

        while (!stack.empty()) {
            current = stack.get(stack.size() - 1);
            System.out.println(current);

            stack.pop();

            if(map.get(current) != null){
                if (map.get(current).contains(",")) {
                    String[] arr = map.get(current).split(",");

                    for (String s : arr) {
                        stack.push(s);
                    }
                } else if (!map.get(current).isEmpty()) {
                    stack.push(map.get(current));
                }
            }
        }
    }
}
