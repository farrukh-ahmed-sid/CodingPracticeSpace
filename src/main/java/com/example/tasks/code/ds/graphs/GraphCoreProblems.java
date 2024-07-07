package com.example.tasks.code.ds.graphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GraphCoreProblems {

    public Map<String, String> initialize() {
        Map<String, String> graph = new HashMap<>();
        graph.put("a", "b,c");
        graph.put("b", "d");
        graph.put("c", "e");
        graph.put("d", "f");
        graph.put("e", null);
        graph.put("f", null);
        graph.put("g", null);
        return graph;
    }

    public void depthFirstPrint(Map<String, String> map, String current) {
        Stack<String> stack = new Stack<>();
        stack.push(current);

        while (!stack.empty()) {
            current = stack.pop();
            System.out.println(current);
            String str = map.get(current);

            if (str != null) {
                if (str.contains(",")) {
                    String[] strArr = str.split(",");
                    stack.addAll(Arrays.asList(strArr));
                } else {
                    stack.push(str);
                }
            }
        }
    }

    public void breadthFirstPrint(Map<String, String> map, String current) {
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

    public int countConnectedGraph(Map<String, String> map) {

        int count = 0;

        if (map.size() == 0) {
            return count;
        }

        Set<String> unvisited = new HashSet<>(map.keySet());
        Stack<String> stack = new Stack<>();

        while (!unvisited.isEmpty()) {

            Optional<String> element = unvisited.stream().findFirst();

            stack.push(element.get());
            unvisited.remove(element.get());

            while (!stack.isEmpty()) {
                String val = stack.pop();
                String v = map.get(val);

                if (v != null) {
                    if (v.contains(",")) {
                        String[] str = v.split(",");

                        for (String s : str) {
                            if (unvisited.contains(s)) {
                                stack.push(s);
                                unvisited.remove(s);
                            }
                        }
                    } else {
                        if (unvisited.contains(v)) {
                            stack.push(v);
                            unvisited.remove(v);
                        }
                    }
                }
            }
            count++;
        }
        return count;
    }
}
