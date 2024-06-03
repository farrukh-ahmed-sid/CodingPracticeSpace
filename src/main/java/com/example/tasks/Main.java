package com.example.tasks;


import com.example.tasks.solutions.LRUCacheImpl;

public class Main {

    public static void main(String[] args) {
        LRUCacheImpl cache = new LRUCacheImpl(4);
        cache.put(1, "Farrukh");
        cache.display();
        cache.put(2, "Ahmed");
        cache.display();
        cache.put(3, "Shizza");
        cache.display();
        cache.put(1, "Rida");
        cache.display();
        cache.put(4, "Abiha");
        cache.display();
        cache.put(5, "Fareeha");
        cache.display();
        System.out.println(cache.get(3));
    }

}
