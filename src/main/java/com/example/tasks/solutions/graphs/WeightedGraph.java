package com.example.tasks.solutions.graphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph {

    public Map<String, List<Path>> initializeDirectionalGraph() {
        Map<String, List<Path>> paths = new HashMap<>();

        paths.put("a", List.of(new Path("b", 2), new Path("c", 1)));
        paths.put("b", List.of(new Path("d", 2)));
        paths.put("c", List.of(new Path("e", 2)));
        paths.put("d", List.of(new Path("f", 2)));
        paths.put("e", null);
        paths.put("f", null);
        paths.put("g", null);
        return paths;
    }

    public Integer pathWeight(Map<String, List<Path>> map, String src, String dst) {
        return 0;
    }
}

class Path {
    private String end;
    private Integer edgeWeight;

    public Path(String end, Integer edgeWeight) {
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
