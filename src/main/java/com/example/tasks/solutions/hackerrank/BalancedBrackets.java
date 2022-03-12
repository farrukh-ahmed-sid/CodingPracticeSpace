package com.example.tasks.solutions.hackerrank;

public class BalancedBrackets {

    public static String initialize() {
        return "{(([])[])[]}\n" +
                "{(([])[])[]]}\n" +
                "{(([])[])[]}[]";
    }

    public static String isBalanced(String s) {

        int size = -1;

        while (s.length() != size) {
            size = s.length();

            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        if (size != 0) {
            return "NO";
        } else {
            return  "YES";
        }
    }
}
