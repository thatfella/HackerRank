package com.challenges;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StairCase {

    // Complete the staircase function below.
    static void staircase(int n) {
        char[] stairs = new char[n];
        Arrays.fill(stairs, ' ');
        String stair = new String(stairs);

        for (int i = stairs.length - 1; i >= 0; i--) {
            String tempStair = stair.substring(i, stair.length());
            String stairToSave = stair.substring(0, i);
            String stairToPut = tempStair.replaceAll(" ", "#");
            String finalStair = stairToSave.concat(stairToPut);
            System.out.println(finalStair);

        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }

}

