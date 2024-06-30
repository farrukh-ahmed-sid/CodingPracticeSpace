package com.example.tasks.code.search;

public class BinarySearch {


    public int[] initialize() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 9};
    }

    public boolean binarySearchIterative(int[] arr, int element) {

        int startIndex = 0;
        int endIndex = arr.length - 1;

        boolean result = false;

        while (startIndex <= endIndex) {
            int midIndex = startIndex + ((endIndex - startIndex ) / 2);

            if (element == arr[midIndex]) {
                result = true;
                break;
            } else if (element < arr[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
        return result;
    }

    public boolean binarySearchRecursive(int[] arr, int element) {
        return search(arr, element, 0, arr.length - 1);
    }

    private boolean search(int[] arr, int element, int startIndex, int endIndex) {

        if (startIndex > endIndex) {
            return false;
        }

        int midIndex = startIndex + ((endIndex - startIndex) / 2);

        if (element == arr[midIndex]) {
            return true;
        } else if (element > arr[midIndex]) {
            return search(arr, element, midIndex + 1, endIndex);
        } else {
            return search(arr, element, startIndex, midIndex - 1);
        }

    }

}
