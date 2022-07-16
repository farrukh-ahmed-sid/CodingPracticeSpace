package com.example.tasks;


import com.example.tasks.solutions.codility.zalando.MaxEmployAttendSession;

public class Main {

    public static void main(String[] args) {

        MaxEmployAttendSession obj = new MaxEmployAttendSession();
        String[] strings = {"5421", "245", "1452", "0345", "53", "345"};
        System.out.println(obj.maxAttendees(strings));
    }

}


