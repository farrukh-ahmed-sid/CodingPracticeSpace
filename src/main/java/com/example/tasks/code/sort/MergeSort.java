package com.example.tasks.code.sort;

public class MergeSort {

    public static void sort(int[] array) {
        mergeSort(array, array.length);
    }

    private static void mergeSort(int[] arr, int size) {
        if (size < 2) {
            return;
        }
        int mid = size / 2;
        int[] l = new int[mid];
        int[] r = new int[size - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < size; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, size - mid);

        merge(arr, l, r, mid, size - mid);
    }

    private static void merge(int[] arr, int[] l, int[] r, int leftSize, int rightSize) {

        int i = 0, j = 0, arrIndex = 0;

        while (i < leftSize && j < rightSize) {
            if (l[i] <= r[j]) {
                arr[arrIndex++] = l[i++];
            } else {
                arr[arrIndex++] = r[j++];
            }
        }
        while (i < leftSize) {
            arr[arrIndex++] = l[i++];
        }
        while (j < rightSize) {
            arr[arrIndex++] = r[j++];
        }
    }
}
