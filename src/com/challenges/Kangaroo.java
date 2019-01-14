package com.challenges;


public class Kangaroo {
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        for (int i = 1; i < 10000; i++) {
            if (x1+v1*i == x2+v2* i)
                return "YES";
        }
        return "NO";
    }


    public static void main(String[] args) {
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;

        int x3 = 0;
        int v3 = 2;
        int x4 = 5;
        int v4 = 3;
        System.out.println(kangaroo(x1,v1,x2,v2));
        System.out.println(kangaroo(x3,v3,x4,v4));

    }
}
