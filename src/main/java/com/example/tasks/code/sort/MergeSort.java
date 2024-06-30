package com.example.tasks.code.sort;

public class MergeSort {

    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // fill the left and right array.
        for (int i = 0; i < n1; i++)
            leftArr[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = array[mid + 1 + j];

        int i, j, arrayIndex;
        i = 0;
        j = 0;
        arrayIndex = left;

        // sort main array with left and right array.
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                array[arrayIndex] = leftArr[i];
                i++;
            } else {
                array[arrayIndex] = rightArr[j];
                j++;
            }
            arrayIndex++;
        }

        // fill remaining from left and right in main array.
        while (i < n1) {
            array[arrayIndex] = leftArr[i];
            i++;
            arrayIndex++;
        }

        while (j < n2) {
            array[arrayIndex] = rightArr[j];
            j++;
            arrayIndex++;
        }
    }
}
