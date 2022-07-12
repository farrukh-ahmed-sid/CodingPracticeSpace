package com.example.tasks.solutions.codility.zalando;

public class SkyscraperHorizontalStrokes {

    public int solution(int[] A) {

        int count = 0;
        boolean remain = true;
        boolean start = false;

        if (A.length == 1) {
            return A.length;
        }
        while (remain) {
            remain = false;

            for (int i = 0; i < A.length; i++) {

                if (A[i] == 0) {
                    start = false;
                    continue;
                }
                if (!start) {
                    start = true;
                    count++;
                }

                A[i] = A[i] - 1;

                if (A[i] != 0) {
                    remain = true;
                }
            }
            start = false;
        }
        return count;
    }
}
