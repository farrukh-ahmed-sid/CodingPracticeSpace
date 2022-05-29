package com.example.tasks.solutions;


import com.example.tasks.solutions.search.BinarySearch;

public class Main {

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();

        int[] arr = search.initialize();

        for(int i : arr){
            System.out.println(search.binarySearchIterative(arr, i));
        }

        System.out.println(search.binarySearchIterative(arr, 12));
    }

}


