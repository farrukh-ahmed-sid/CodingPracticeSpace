package com.example.tasks.code.sort;

public class SelectionSort {

    public void sort(int[] arr) {

        if (arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int smallest = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (smallest > arr[j]) {
                    smallest = arr[j];
                    arr[j] = arr[i];
                    arr[i] = smallest;
                }
            }
        }
    }
}
