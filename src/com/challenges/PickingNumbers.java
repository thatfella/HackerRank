package com.challenges;


import java.util.*;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int count;
        List<Integer> res = new ArrayList<>();
        for (int i= 0; i < a.size(); i++){
            count = 0;
            for (int j = i; j < a.size(); j++) {
                if (Math.abs(a.get(i)- a.get(j))<=1) {
                    count++;
                }
            }
        res.add(count);}
        return  res.stream().reduce(Integer::max).get();

    }

    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(2);
        a1.add(3);
        a1.add(1);
        a1.add(2);

        List<Integer> a2 = new ArrayList<>();
        a2.add(4);
        a2.add(6);
        a2.add(5);
        a2.add(3);
        a2.add(3);
        a2.add(1);

        //4 6 5 3 3 1
        int z = pickingNumbers(a2);

        int v = pickingNumbers(a1);

        System.out.println(v);
        System.out.println(z);
    }
}
