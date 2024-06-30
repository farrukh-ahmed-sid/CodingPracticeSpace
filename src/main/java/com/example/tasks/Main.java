package com.example.tasks;


import com.example.tasks.code.search.BinarySearch;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        BinarySearch binarySearch = new BinarySearch();
        boolean b = binarySearch.binarySearchIterative(arr, 55);

        System.out.println(b);

        for(int e : arr) {
            System.out.println(e);
        }

    }

}
