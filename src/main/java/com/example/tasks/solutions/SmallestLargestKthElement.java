package com.example.tasks.solutions;

import java.util.Arrays;

public class SmallestLargestKthElement {

    public int[] initialize() {
        return new int[]{3, 5, 1, 6, 8, 4};
    }

    public void smallestKthElement(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }

    public void largestKthElement(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - k]);
    }
}
