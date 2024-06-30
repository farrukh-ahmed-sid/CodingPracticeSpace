package com.example.tasks.code.codility.zalando;

import java.util.ArrayList;
import java.util.List;

public class GuardAndAssassin {

    private static final List<String> visited = new ArrayList<>();
    private static final String BLOCK = "b";
    private static final String VIEW = "e";
    private static final String PATH = "_";
    private static final String ASSASSIN = "a";

    public String[][] initialize() {

        return new String[][]{
                {"_", "_", "_", "_", "_", "_"},
                {"_", "A", "b", "_", "_", "_"},
                {"_", "_", "b", ">", "_", "_"},
                {"_", "_", "_", "b", "_", "_"},
                {"_", "_", "_", "_", "_", "_"},
                {"_", "_", "b", "_", "^", "_"},
        };

    }

    public boolean guardAndAssassin(String[][] box) {
        int rowSize = box.length;
        int colSize = box[0].length;
        boolean possible = false;
        String assassinLocation = "";

        if (box[rowSize - 1][colSize - 1].equalsIgnoreCase(ASSASSIN)) {
            possible = true;
        } else if (box[rowSize - 1][colSize - 1].equalsIgnoreCase(PATH)) {
            for (int r = 0; r < box.length; r++) {
                for (int c = 0; c < box[0].length; c++) {
                    if (box[r][c].equalsIgnoreCase(ASSASSIN)) {
                        assassinLocation = r + "," + c;
                    } else if (box[r][c].equalsIgnoreCase("^")) {
                        for (int i = r; i >= 0; i--) {
                            if (box[i][c].equalsIgnoreCase(BLOCK))
                                break;
                            box[i][c] = VIEW;
                        }
                    } else if (box[r][c].equalsIgnoreCase("v")) {
                        for (int i = r; i < box.length; i++) {
                            if (box[i][c].equalsIgnoreCase(BLOCK))
                                break;
                            box[i][c] = VIEW;
                        }
                    } else if (box[r][c].equalsIgnoreCase("<")) {
                        for (int i = c; i >= 0; i--) {
                            if (box[r][i].equalsIgnoreCase(BLOCK))
                                break;
                            box[r][i] = VIEW;
                        }
                    } else if (box[r][c].equalsIgnoreCase(">")) {
                        for (int i = c; i < box[0].length; i++) {
                            if (box[r][i].equalsIgnoreCase(BLOCK))
                                break;
                            box[r][i] = VIEW;
                        }
                    }
                }
            }

            if (!(assassinLocation.isEmpty()
                    && box[rowSize - 1][colSize - 1].equalsIgnoreCase(VIEW))) {
                String[] arr = assassinLocation.split(",");
                possible = evaluate(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), box);
            }
        }

        for (String[] strings : box) {
            for (int c = 0; c < box[0].length; c++) {
                System.out.print(strings[c] + ",");
            }
            System.out.println();
        }
        return possible;
    }


    private boolean evaluate(int r, int c, String[][] box) {
        boolean result = r == box.length - 1 && c == box[0].length - 1;

        if (result) {
            if (box[r][c].equalsIgnoreCase(BLOCK) || box[r][c].equalsIgnoreCase(VIEW)) {
                result = false;
            }
        } else {
            String location = r + "," + c;

            if (!(r < 0 || c < 0 || r >= box.length || c >= box[0].length
                    || box[r][c].equalsIgnoreCase(BLOCK)
                    || box[r][c].equalsIgnoreCase(VIEW)
                    || visited.contains(location))) {
                visited.add(location);
                box[r][c] = "*";

                result = evaluate(r, c + 1, box)
                        || (evaluate(r + 1, c, box)
                        || (evaluate(r, c - 1, box)
                        || (evaluate(r - 1, c, box))));
            }
        }
        return result;
    }
}
