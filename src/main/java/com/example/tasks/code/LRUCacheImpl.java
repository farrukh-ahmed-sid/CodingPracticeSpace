package com.example.tasks.code;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCacheImpl {

    private final Deque<Integer> doublyQueue;
    private final Map<Integer, String> hashMap;
    private final int CACHE_SIZE;

    public LRUCacheImpl(int capacity) {
        doublyQueue = new LinkedList<>();
        hashMap = new HashMap<>();
        CACHE_SIZE = capacity;
    }

    public String get(int key) {
        return hashMap.get(key);
    }

    public synchronized void put(int key, String val) {
        if (!hashMap.containsKey(key)) {
            if (doublyQueue.size() == CACHE_SIZE) {
                int last = doublyQueue.removeLast();
                hashMap.remove(last);
            }
        } else {
            doublyQueue.remove(key);
        }
        doublyQueue.push(key);
        hashMap.put(key, val);
    }

    public void display() {
        for (Integer k : doublyQueue) {
            System.out.print(hashMap.get(k) + " ");
        }
        System.out.println();
    }
}
