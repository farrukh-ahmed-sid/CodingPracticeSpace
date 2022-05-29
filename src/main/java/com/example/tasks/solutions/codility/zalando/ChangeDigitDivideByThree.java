package com.example.tasks.solutions.codility.zalando;

public class ChangeDigitDivideByThree {

    /*Given a string str representing a number having N digits,
    calculate the number of ways to make the given number divisible by 3
    by changing at most one digit of the number.*/

    public void findCount(String number) {

        int sum = 0;

        for (int i = 0; i < number.length(); ++i) {
            sum += number.charAt(i) - 48;
        }

        int count = 0;

        for (int i = 0; i < number.length(); ++i) {

            int remaining_sum
                    = sum - (number.charAt(i) - 48);
            if ((remaining_sum) % 3 == 0) {
                count += 4;
            } else {
                count += 3;
            }
        }
        if (sum % 3 == 0) {
            count = count - number.length() + 1;
        }
        System.out.println(count);
    }
}
