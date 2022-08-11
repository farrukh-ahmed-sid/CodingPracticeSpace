package com.example.tasks.solutions.graphs;

import java.util.Arrays;
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
            current = stack.pop();
            System.out.println(current);
            String str = map.get(current);

            if(str != null){
                if (str.contains(",")) {
                    String[] strArr = str.split(",");
                    stack.addAll(Arrays.asList(strArr));
                } else {
                    stack.push(str);
                }
            }
        }
    }
}
