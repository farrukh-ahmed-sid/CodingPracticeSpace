package com.example.tasks.solutions;

public class BalancedBrackets {

    public String initialize() {
        return "{(([])[])[]}\n" +
                "{(([])[])[]]}\n" +
                "{(([])[])[]}[]";
    }

    public String isBalanced(String s) {

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
