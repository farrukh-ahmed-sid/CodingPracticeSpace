package com.example.tasks.solutions.search;

public class BinarySearch {


    public int[] initialize() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 9};
    }

    public boolean binarySearchIterative(int[] arr, int element) {

        int left = 0;
        int right = arr.length - 1;
        boolean result = false;

        while (left <= right) {
            //we do this instead of (start + end)/2
            // bcz it can cause bug when integer become greater than max integer size
            int mid = left + (right - left) / 2;

            if (arr[mid] == element) {
                result = true;
                break;
            } else if (arr[mid] > element)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return result;
    }

    public boolean binarySearchRecursive(int[] arr, int element) {
        return search(arr, element, 0, arr.length - 1);
    }

    private boolean search(int[] arr, int element, int startIndex, int endIndex) {

        boolean result = false;

        if (startIndex <= endIndex) {
            //we do this instead of (start + end)/2
            // bcz it can cause bug when integer become greater than max integer size
            int midIndex = startIndex + ((endIndex - startIndex) / 2);

            if (arr[midIndex] > element)
                result = search(arr, element, startIndex, midIndex - 1);
            else if (arr[midIndex] < element)
                result = search(arr, element, midIndex + 1, endIndex);
            else
                result = arr[midIndex] == element;
        }
        return result;
    }

}
