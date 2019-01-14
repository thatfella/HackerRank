package com.challenges;

/**
 * Created by ESALE on 09.01.2019.
 */
public class ThePowerSum {

    static int powerSum(int X, int N) {
        int counter = 0;
        while (X>0) {
        int restOfNumber = X - powerSum(X-1,N);
            if (restOfNumber ==1 ) {
                return 1;
            }
        }
        return  counter;
    }
    static int findRestOfNumber(int X, int N) {
        return (int) Math.pow(X,N);
    }
    public static void main(String[] args)  {
        int counter = powerSum(10,2);
        System.out.println(counter);
    }
}
