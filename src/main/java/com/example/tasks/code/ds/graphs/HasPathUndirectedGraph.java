package com.example.tasks.code.ds.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

//undirected graph is both direction graph
public class HasPathUndirectedGraph {

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
}
