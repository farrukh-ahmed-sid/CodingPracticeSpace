package com.example.tasks.solutions.graphs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class WeightedGraph {

    public Map<String, List<Node>> initializeDirectionalGraph() {
        Map<String, List<Node>> paths = new HashMap<>();

        paths.put("a", List.of(new Node("b", 2), new Node("c", 1)));
        paths.put("b", List.of(new Node("d", 2)));
        paths.put("c", List.of(new Node("e", 2)));
        paths.put("d", List.of(new Node("f", 2)));
        paths.put("e", null);
        paths.put("f", null);
        paths.put("g", null);
        return paths;
    }

    public Integer pathWeight(Map<String, List<Node>> map, String src, String dst) {

        int result = 0;
        int count = 0;

        if (src.equals(dst)) {
            return result;
        }

        Stack<String> stack = new Stack<>();
        stack.push(src);

        while (!stack.isEmpty()) {
            String str = stack.pop();

            if (str != null) {
                List<Node> list = map.get(str);

                if (list != null) {
                    //TODO: need to complete
                }
            }
        }
        return result;
    }

    private class Node {
        private String end;
        private Integer edgeWeight;

        public Node(String end, Integer edgeWeight) {
            this.end = end;
            this.edgeWeight = edgeWeight;
        }

        public String getEnd() {
            return end;
        }

        public Integer getEdgeWeight() {
            return edgeWeight;
        }
    }
}


