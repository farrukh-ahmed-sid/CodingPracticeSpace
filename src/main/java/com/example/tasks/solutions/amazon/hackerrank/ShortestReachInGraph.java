package com.example.tasks.solutions.amazon.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ShortestReachInGraph {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/frahmed/Desktop/input2.txt"));
        String inputLine;
        final int EDGE_COST = 6;
        final String SEPARATOR = " ";
        int queries = 0;
        boolean nodesAndEdges = true;
        int nodes = 0;
        Map<Integer, Set<Integer>> pathToNextNodes = new HashMap<>();

        while (scanner.hasNextLine()) {
            inputLine = scanner.nextLine();

            if (queries == 0) {
                queries = Integer.parseInt(inputLine);
            } else if (nodesAndEdges && inputLine.contains(SEPARATOR)) {
                String[] arr = inputLine.split(SEPARATOR);
                nodes = Integer.parseInt(arr[0]);
                nodesAndEdges = false;
            } else if (!nodesAndEdges && inputLine.contains(SEPARATOR)) {
                String[] temp = inputLine.split(SEPARATOR);
                int left = Integer.parseInt(temp[0]);
                int right = Integer.parseInt(temp[1]);

                pathBetweenNodes(pathToNextNodes, left, right);
                pathBetweenNodes(pathToNextNodes, right, left);

            } else if (!inputLine.contains(SEPARATOR)) {
                int startNodeValue = Integer.parseInt(inputLine);
                int currentNode;

                List<Integer> nodeList = new ArrayList<>();

                for (int i = 1; i <= nodes; i++) {
                    nodeList.add(-1);
                }

                Queue<Integer> queue = new LinkedList<>();
                queue.add(startNodeValue);
                nodeList.set(startNodeValue - 1, 0);

                while (!queue.isEmpty()) {
                    currentNode = queue.poll();

                    if (pathToNextNodes.get(currentNode) == null) {
                        continue;
                    }
                    for (Integer nextNode : pathToNextNodes.get(currentNode)) {
                        Integer nextNodeValue = nodeList.get(nextNode - 1);

                        if (nextNodeValue == -1) {
                            Integer currentNodeValue = nodeList.get(currentNode - 1);
                            nodeList.set(nextNode - 1, currentNodeValue + EDGE_COST);
                            queue.add(nextNode);
                        }
                    }
                }

                StringBuilder stringBuilder = new StringBuilder();

                for (int i = 0; i < nodeList.size(); i++) {
                    int count = nodeList.get(i);

                    if (count != 0) {
                        if (i == nodeList.size() - 1) {
                            stringBuilder.append(count);
                        } else {
                            stringBuilder.append(count).append(SEPARATOR);
                        }
                    }
                }
                System.out.println(stringBuilder);

                pathToNextNodes = new HashMap<>();
                nodesAndEdges = true;
            }
        }
        scanner.close();
    }
    private static void pathBetweenNodes(Map<Integer, Set<Integer>> pathToNextNodes, int key, int value){
        Set<Integer> values;

        if (Objects.isNull(pathToNextNodes.get(key))) {
            values = new HashSet<>();
        } else {
            values = pathToNextNodes.get(key);
        }
        values.add(value);
        pathToNextNodes.put(key, values);
    }
}
