package Leetcode;

import java.util.Arrays;
import java.util.List;

public class P3248nakeMatrix {

    public static int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0; // for Rows
        int j = 0; // for Columns
        for (String comd : commands) {
            switch (comd) {
                case "UP":
                    i--;
                    break;
                case "RIGHT":
                    j++;
                    break;
                case "DOWN":
                    i++;
                    break;
                case "LEFT":
                    j--;
                    break;

            }
        }
        return (i * n) + j;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> commands = Arrays.asList("DOWN", "RIGHT", "UP");
        System.out.println(finalPositionOfSnake(n, commands));
    }
}
