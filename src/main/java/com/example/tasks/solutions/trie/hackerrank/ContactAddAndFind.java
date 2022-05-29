package com.example.tasks.solutions.trie.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactAddAndFind {

    public List<List<String>> initialize() {
        List<String> l1 = new ArrayList<>();
        l1.add("add");
        l1.add("hack");
        List<String> l3 = new ArrayList<>();
        l3.add("add");
        l3.add("hackerrank");

        List<String> l2 = new ArrayList<>();
        l2.add("find");
        l2.add("hac");

        List<List<String>> result = new ArrayList<>();
        result.add(l1);
        result.add(l3);
        result.add(l2);
        return result;
    }

    public List<Integer> contacts(List<List<String>> queries) {
        NodeService nodeService = new NodeService();

        List<Integer> result = new ArrayList<>();

        for (List<String> query : queries) {
            if (query.get(0).equalsIgnoreCase("add")) {
                nodeService.add(query.get(1));
            } else {
                result.add(nodeService.findAndCount(query.get(1)));
            }
        }
        return result;
    }

    static class NodeService {
        Node root = new Node();

        void add(String str) {
            Node current = root;

            for (char c : str.toCharArray()) {
                current.add(c);
                current = current.get(c);
                current.count++;
            }
        }

        int findAndCount(String str) {
            Node current = root;

            for (char c : str.toCharArray()) {
                if (current.get(c) == null) {
                    return 0;
                }
                current = current.get(c);
            }
            return current.count;
        }
    }

    static class Node {
        Map<Character, Node> node = new HashMap<>();
        int count = 0;

        void add(char c) {
            node.putIfAbsent(c, new Node());
        }

        Node get(char c) {
            return node.get(c);
        }
    }
}
