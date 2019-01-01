package com.challenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Created by ESALE on 01.01.2019.
 */
public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float pos = 0;
        float neg = 0;
        float zer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zer++;
            }
        }

        System.out.println(pos / arr.length);
        System.out.println(neg / arr.length);
        System.out.println(zer / arr.length);

    }

    public static void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            boolean timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                if (amountEaten > 0) {
                    roomInBelly = roomInBelly - amountEaten;

                    amountOfFood = amountOfFood - amountEaten;
                    System.out.println("Room in belly " + roomInBelly);
                }
            }
        }
        System.out.println("Room in belly " + roomInBelly);
        System.out.println(amountOfFood);
    }

    public static void main(String[] args) {
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = {-14, 5, 2};
//
//            String[] arrItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//            for (int i = 0; i < n; i++) {
//                int arrItem = Integer.parseInt(arrItems[i]);
//                arr[i] = arrItem;
//            }

        eatMore(true, 2);
        plusMinus(arr);

    }
}


