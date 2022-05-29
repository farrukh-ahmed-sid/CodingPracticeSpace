package com.example.tasks.solutions.codility.alten;

import java.util.ArrayList;
import java.util.List;

public class NumbersInCircle {
    public int numberOfEvenSumsOfValuesInCircle(int[] A) {
        int count = 0;
        List<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            int sum;
            int nextIndex = i + 1;

            if (nextIndex == A.length) {
                nextIndex = 0;
            }
            if (indexList.contains(i)
                    || (nextIndex == 0 && indexList.contains(nextIndex))) {
                continue;
            }
            sum = A[i] + A[nextIndex];

            if (sum % 2 == 0) {
                count++;
                indexList.add(i);
                indexList.add(nextIndex);
            }
        }
        return count;
    }
}
