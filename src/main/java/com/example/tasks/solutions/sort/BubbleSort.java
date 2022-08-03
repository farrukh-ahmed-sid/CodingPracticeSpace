package com.example.tasks.solutions.sort;

public class BubbleSort {


    public void sort(int[] arr) {

        boolean isSorted = false;
        int count = arr.length - 1;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < count; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    isSorted = false;
                }
            }
            count--;
        }
    }
}
