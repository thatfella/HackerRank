package com.challenges;

import java.io.*;
import java.util.*;


public class MagicSquare {

    static int formingMagicSquare(int[][] s) {
        int[][] idealPatterns = {{4,9,2,3,5,7,8,1,6},
                {4,3,8,9,5,1,2,7,6},
                {2,9,4,7,5,3,6,1,8},
                {2,7,6,9,5,1,4,3,8},
                {8,1,6,3,5,7,4,9,2},
                {8,3,4,1,5,9,6,7,2},
                {6,7,2,1,5,9,8,3,4},
                {6,1,8,7,5,3,2,9,4},
        };
        int[] sArrayAsLine = new int[9];
        int startOfLinearArray = 0;
        // get content of 2d array as 1d array
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                sArrayAsLine[startOfLinearArray++] = s[i][j];
            }
        }

        int diffs[] = new int[8];
        //then compare our sArrayAsLine to any of "Ideal Patterns" and fill the differences array
        for (int i = 0; i < idealPatterns.length; i++) {
            for (int j = 0; j < idealPatterns[i].length; j++) {
                    diffs[i]+= Math.abs(idealPatterns[i][j] - sArrayAsLine[j]);
            }
        }

        //search the minimal value in differences array
        int minimalcost = diffs[0];
        for (int i = 0; i < diffs.length; i++) {
            System.out.println("diff is "+ diffs[i]);
            if (diffs[i] < minimalcost) {
                minimalcost = diffs[i];
            }
        }


        return minimalcost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] s = {{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};
//
//        for (int i = 0; i < 3; i++) {
//            String[] sRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 3; j++) {
//                int sItem = Integer.parseInt(sRowItems[j]);
//                s[i][j] = sItem;
//            }
//        }

        int result = formingMagicSquare(s);
        System.out.println(result);

        scanner.close();
    }
}
