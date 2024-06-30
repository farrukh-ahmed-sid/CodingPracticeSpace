package com.example.tasks.code.ds.graphs;

import java.util.Map;
import java.util.Stack;

public class HasPathDirectedGraph {

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
}
