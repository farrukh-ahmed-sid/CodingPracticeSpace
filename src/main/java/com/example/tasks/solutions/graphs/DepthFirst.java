package com.example.tasks.solutions.graphs;

import java.util.Map;
import java.util.Stack;

public class DepthFirst {


    public static void depthFirst(Map<String, String> map, String current) {

        Stack<String> stack = new Stack<>();
        stack.push(current);

        while (!stack.empty()) {
            current = stack.get(stack.size() - 1);
            System.out.println(current);

            stack.pop();

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
