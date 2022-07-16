package com.example.tasks.solutions.codility.zalando;

public class MaxEmployAttendSession {

    /*
    A one-day-long training session will be conducted twice during the next 10 days.
    There are N employees (numbered from 0 to N-1) willing to attend it.
    Each employee has provided a list of which of the next 10 days they are able to participate in the training.
    The employees' preferences are represented as an array of strings.
    E[K] is a string consisting of digits ('0'-'9') representing the days the K-th employee is able to attend the training.

    What is the maximum number of employees that can attend during at least one of the two scheduled days?
    Write a function that, given an array E consisting of N strings denoting the available days for each employee,
    will return the maximum number of employees that can attend during at least one of the two scheduled days.

    Given E = ["039", "4", "14", "32", "", "34", "7"], the answer is 5.
    It can be achieved for example by running training on days 3 and 4.
    This way employees number 0, 1, 2, 3 and 5 will attend the training.

    Given E = ["801234567", "180234567", "0", "189234567", "891234567", "98", "9"], the answer is 7.
    It can be achieved for example by running training on days 0 and 9. This way all employees will attend the training.

    Given E = ["5421", "245", "1452", "0345", "53", "345"], the answer is 6.
    It can be achieved for example by running training once on day 5. This way all employees will attend the training.

    https://stackoverflow.com/questions/72046602/find-max-students-who-can-attend-the-session
    */

    public int maxAttendees(String[] E) {
        int max = 0;

        for (int i = 0; i < 10; i++)
            for (int j = i + 1; j < 10; j++) {
                //create all pairs of days one by one like 01, 02, 03, 04, 05..... 89
                String subStr = i + "" + j;
                int count = 0;

                for (int emp = 0; emp < E.length; emp++) {
                    String val = E[emp];

                    if (val.matches(".*[" + subStr + "].*"))
                        count++;
                }
                if (count > max)
                    max = count;
            }
        return max;
    }
}
