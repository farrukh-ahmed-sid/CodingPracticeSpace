package com.example.tasks.code.sort;

public class SelectionSort {

    public void sort(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {

            int minElementIdx = i;

            for (int j = i + 1; j < length; j++) {

                if (arr[j] < arr[minElementIdx]) {
                    minElementIdx = j;
                }
            }

            if (minElementIdx != i) {
                int temp = arr[minElementIdx];
                arr[minElementIdx] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
