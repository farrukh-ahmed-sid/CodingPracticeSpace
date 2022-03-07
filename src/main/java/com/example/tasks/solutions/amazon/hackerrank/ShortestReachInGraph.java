package com.example.tasks.solutions.amazon.hackerrank;

import java.util.*;

public class ShortestReachInGraph {

    public static void main(String[] args) {

        String input = "1\n" +
                "7 4\n" +
                "1 2\n" +
                "1 3\n" +
                "3 4\n" +
                "2 5\n" +
                "2";

        Scanner scanner = new Scanner(input);
        String inputLine;

        final int EDGE_COST = 6;

        int queries = 0;
        boolean nodesAndEdges = true;
        int nodes = 0;
        Map<Integer, Set<Integer>> pathToNextNodes = new HashMap<>();

        while (scanner.hasNextLine()) {
            inputLine = scanner.nextLine();

            if (queries == 0) {
                queries = Integer.parseInt(inputLine);
            } else if (nodesAndEdges && inputLine.length() > 1) {
                String[] arr = inputLine.split(" ");
                nodes = Integer.parseInt(arr[0]);
                nodesAndEdges = false;
            } else if (!nodesAndEdges && inputLine.length() > 1) {
                String[] temp = inputLine.split(" ");
                int key = Integer.parseInt(temp[0]);
                int value = Integer.parseInt(temp[1]);
                Set<Integer> values;

                if (Objects.isNull(pathToNextNodes.get(key))) {
                    values = new HashSet<>();
                    values.add(value);
                    pathToNextNodes.put(key, values);
                } else {
                    values = pathToNextNodes.get(key);
                    values.add(value);
                    pathToNextNodes.put(key, values);
                }
                values.add(value);
                pathToNextNodes.put(key, values);
            } else if (inputLine.length() == 1) {
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
                            stringBuilder.append(count).append(" ");
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
}
