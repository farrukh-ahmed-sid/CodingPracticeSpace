package com.example.tasks.solutions.graphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class GraphBase {

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

    public boolean hasPathDirectedGraph(Map<String, String> map, String src, String dst) {

        if (src.equals(dst)) {
            return true;
        }
        Stack<String> stack = new Stack<>();
        stack.push(src);

        while (!stack.isEmpty()) {
            String str = map.get(stack.pop());

            if (str != null) {
                if (str.contains(",")) {
                    String[] strArr = str.split(",");

                    for (String s : strArr) {
                        if (s.equals(dst)) {
                            return true;
                        }
                        stack.push(s);
                    }
                } else if (str.equals(dst)) {
                    return true;
                } else {
                    stack.push(str);
                }
            }
        }
        return false;
    }

    //undirected graph is both direction graph
    public Map<String, String> getAdjacencyListFromUndirectedGraph(Map<String, String> map) {
        Map<String, String> adjacencyListMap = new HashMap<>();

        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            String val = map.get(key);

            if (adjacencyListMap.containsKey(key)) {
                if(val != null){
                    adjacencyListMap.put(key, adjacencyListMap.get(key) + "," + val);
                }
            } else {
                adjacencyListMap.put(key, val);
            }

            if (val != null) {
                if (val.contains(",")) {

                    for (String v : val.split(",")) {
                        if (adjacencyListMap.containsKey(v)) {
                            adjacencyListMap.put(v, adjacencyListMap.get(v) + "," + key);
                        } else {
                            adjacencyListMap.put(v, key);
                        }
                    }
                } else {
                    if (adjacencyListMap.containsKey(val)) {
                        adjacencyListMap.put(val, adjacencyListMap.get(val) + "," + key);
                    } else {
                        adjacencyListMap.put(val, key);
                    }
                }
            }
        }
        return adjacencyListMap;
    }

    public boolean hasPathUndirectedGraph(Map<String, String> map, String src, String dst) {
        map = getAdjacencyListFromUndirectedGraph(map);

        Set<String> visitedNodes = new HashSet<>();

        if (src.equals(dst)) {
            return true;
        }
        Stack<String> stack = new Stack<>();
        stack.push(src);

        while (!stack.isEmpty()) {
            String str = map.get(stack.pop());

            if (str != null) {
                if (str.contains(",")) {
                    String[] strArr = str.split(",");

                    for (String s : strArr) {
                        if (s.equals(dst)) {
                            return true;
                        }
                        if (!visitedNodes.contains(s)) {
                            stack.push(s);
                            visitedNodes.add(s);
                        }
                    }
                } else if (str.equals(dst)) {
                    return true;
                } else {
                    if (!visitedNodes.contains(str)) {
                        stack.push(str);
                        visitedNodes.add(str);
                    }
                }
            }
        }
        return false;
    }

}
