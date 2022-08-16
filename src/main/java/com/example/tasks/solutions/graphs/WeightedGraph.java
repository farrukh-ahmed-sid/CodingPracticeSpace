package com.example.tasks.solutions.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class WeightedGraph {

    public Map<String, List<NodeWithWeight>> initializeDirectionalGraph() {
        Map<String, List<NodeWithWeight>> paths = new HashMap<>();

        paths.put("a", List.of(
                new NodeWithWeight("b", 2),
                new NodeWithWeight("c", 3)));
        paths.put("b", List.of(new NodeWithWeight("d", 1)));
        paths.put("c", List.of(new NodeWithWeight("e", 5)));
        paths.put("d", List.of(
                new NodeWithWeight("e", 1),
                new NodeWithWeight("f", 1)));
        paths.put("e", List.of(new NodeWithWeight("d", 1)));
        paths.put("f", null);
        paths.put("g", null);
        return paths;
    }

    public Integer shortestPath(Map<String, List<NodeWithWeight>> map, String src, String dst) {

        if (src.equals(dst)) {
            return 0;
        }

        Optional<NodeWithWeight> immediateNode = map.get(src).stream().filter(v -> dst.equals(v.name)).findFirst();

        if (immediateNode.isPresent()) {
            return immediateNode.get().distance;
        }

        //applying Dijkstra’s algorithm
        // map.keySet() not assigned directly because when remove unvisited, it will also remove value from map.
        Set<String> unvisited = new HashSet<>(map.keySet());

        Map<String, NodeWithWeight> shortestDistanceMap = new HashMap<>();

        //filling shortestDistanceMap map with initial values
        //In NodeWithWeight name represent previous vertex/node name;
        for (String uv : unvisited) {
            if (uv.equals(src)) {
                shortestDistanceMap.put(src, new NodeWithWeight(0));
            } else {
                shortestDistanceMap.put(uv, new NodeWithWeight(-1));
            }
        }

        String start = src;
        int startShortestDistance;

        //filling shortestDistanceMap with the shortest distance
        while (!unvisited.isEmpty()) {
            List<NodeWithWeight> nodes = map.get(start);

            if (nodes == null) {
                unvisited.remove(start);

                if (unvisited.iterator().hasNext()) {
                    start = unvisited.iterator().next();
                }
                continue;
            }

            startShortestDistance = shortestDistanceMap.get(start).distance;

            String next = null;
            int nextDistance = -1;

            for (NodeWithWeight node : nodes) {
                NodeWithWeight shortestDistanceNode = shortestDistanceMap.get(node.name);

                if (shortestDistanceNode.distance == -1
                        || shortestDistanceNode.distance > startShortestDistance + node.distance) {
                    shortestDistanceNode.distance = startShortestDistance + node.distance;
                    shortestDistanceNode.name = start;
                }
                //Select next start node to evaluate. Shortest one selected from node list who have next nodes.
                if (map.get(node.name) != null) {
                    if (nextDistance == -1 || nextDistance > node.distance) {
                        nextDistance = node.distance;
                        next = node.name;
                    }
                }
            }
            unvisited.remove(start);

            if (unvisited.contains(next)) {
                start = next;
            } else if (unvisited.iterator().hasNext()) {
                start = unvisited.iterator().next();
            } else {
                break;
            }
        }

        return shortestDistanceMap.get(dst).distance;
    }

    private static class NodeWithWeight {
        String name;
        Integer distance;

        public NodeWithWeight(Integer distance) {
            this.distance = distance;
        }

        public NodeWithWeight(String name, Integer distance) {
            this.name = name;
            this.distance = distance;
        }
    }
}


