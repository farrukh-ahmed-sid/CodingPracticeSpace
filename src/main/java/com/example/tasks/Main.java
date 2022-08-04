package com.example.tasks;


import com.example.tasks.solutions.sort.MergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {4,2,6,3,1,9,7,5,8};

        MergeSort sort = new MergeSort();
        sort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

}


