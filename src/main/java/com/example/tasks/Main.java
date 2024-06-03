package com.example.tasks;


import com.example.tasks.solutions.LRUCacheImpl;

public class Main {

    public static void main(String[] args) {
        LRUCacheImpl cache = new LRUCacheImpl(4);
        cache.refer(1);
        cache.display();
        cache.refer(2);
        cache.display();
        cache.refer(3);
        cache.display();
        cache.refer(1);
        cache.display();
        cache.refer(4);
        cache.display();
        cache.refer(5);
        cache.display();
    }

}
