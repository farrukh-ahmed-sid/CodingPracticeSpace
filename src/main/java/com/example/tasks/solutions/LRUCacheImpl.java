package com.example.tasks.solutions;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class LRUCacheImpl {

    private final Deque<Integer> doublyQueue;
    private final HashSet<Integer> hashSet;
    private final int CACHE_SIZE;

    public LRUCacheImpl(int capacity) {
        doublyQueue = new LinkedList<>();
        hashSet = new HashSet<>();
        CACHE_SIZE = capacity;
    }

    public void refer(int key) {
        if (!hashSet.contains(key)) {
            if (doublyQueue.size() == CACHE_SIZE) {
                int last = doublyQueue.removeLast();
                hashSet.remove(last);
            }
        } else {
            doublyQueue.remove(key);
        }
        doublyQueue.push(key);
        hashSet.add(key);
    }

    public void display() {
        for (Integer integer : doublyQueue) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
