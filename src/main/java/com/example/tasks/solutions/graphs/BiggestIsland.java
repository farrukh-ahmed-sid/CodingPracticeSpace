package com.example.tasks.solutions.graphs;

public class BiggestIsland {

    int count = 0;

    public String[][] initialize() {

        return new String[][]{
                {"W", "W", "W", "W", "W", "W"},
                {"W", "L", "L", "L", "W", "W"},
                {"W", "L", "L", "L", "W", "W"},
                {"W", "W", "L", "W", "W", "W"},
                {"W", "W", "W", "W", "W", "W"},
                {"W", "W", "L", "W", "L", "L"},
        };
    }
    
    public int biggestIsland(String[][] box) {

        int val = 0;

        for (int r = 0; r < box.length; r++) {
            for (int c = 0; c < box[0].length; c++) {
                if (evaluateWaterAndLand(r, c, box)) {
                    if(count > val){
                        val = count;
                    }
                    count = 0;
                }
            }
        }
        return val;
    }

    private boolean evaluateWaterAndLand(int r, int c, String[][] box) {
        if((r < 0 || c < 0 || r == box.length || c == box[0].length)
                || (box[r][c].equalsIgnoreCase("w")
                || box[r][c].equalsIgnoreCase("y"))){
            return false;
        }

        if (box[r][c].equalsIgnoreCase("l")) {
            box[r][c] = "y";
            count++;
        }
        evaluateWaterAndLand(r, c + 1, box);
        evaluateWaterAndLand(r + 1, c, box);
        evaluateWaterAndLand(r, c - 1, box);
        evaluateWaterAndLand(r - 1, c, box);

        return true;
    }

}
