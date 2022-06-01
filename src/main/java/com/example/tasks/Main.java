package com.example.tasks;


import com.example.tasks.solutions.SmallestLargestKthElement;

public class Main {

    public static void main(String[] args) {

        SmallestLargestKthElement obj = new SmallestLargestKthElement();
        int[] arr = obj.initialize();
        obj.smallestKthElement(arr, 3);

    }

}


