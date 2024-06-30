package com.example.tasks.code;

/*
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/

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
