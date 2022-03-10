package com.example.tasks.solutions.amazon.hackerrank.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactAddAndFind {

    public static List<List<String>> initialize() {
        List<String> l1 = new ArrayList<>();
        l1.add("add");
        l1.add("farrukh");

        List<String> l2 = new ArrayList<>();
        l2.add("find");
        l2.add("far");

        List<List<String>> result = new ArrayList<>();
        result.add(l1);
        result.add(l2);
        return result;
    }

    class Node {
        Map<Character, Node> nodeMap = new HashMap<>();
        int size = 0;
        boolean isLastNode = false;

    }

    class NodeHelper {

    }



    public static List<Integer> contacts(List<List<String>> queries) {

        List<String> records = new ArrayList<>();
        List<Integer> countRecords = new ArrayList<>();

        for (List<String> query : queries) {

            if (query.get(0).equals("add")) {
                records.add(query.get(1));
            } else {
                String value = query.get(1);
                int count = 0;

                for (String record : records) {
                    if (record.startsWith(value)) {
                        count++;
                    }
                }
                countRecords.add(count);
            }
        }
        return countRecords;
    }
}
