package com.challenges;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.of;


public class ClimbingTheLeaderboard {
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] alicePos = new int[alice.length];
        System.out.println("Alice length" + alice.length);

        scores = of(scores).sorted().distinct().toArray();

        int[] newScores = new int[scores.length];

            for (int i = 0; i < newScores.length; i++) {
                if (i < scores.length) {
                    newScores[i] = scores[i];

                System.out.println("res " + newScores[i]);
            }
        }

        List<Integer> newList = Arrays.stream(newScores).boxed().collect(Collectors.toList());
        System.out.println(newList.size());


        for (int i = 0; i < alice.length; i ++) {
            System.out.println("Alices is "+ alice[i]);
            newList.add(alice[i]);
            newList = newList.stream().distinct().sorted().collect(Collectors.toList());
            int pos = newList.indexOf(alice[i]);
            alicePos [i]= newList.size() - pos;
            newList.remove(pos);
        }

        return alicePos;
    }

    public static void main(String[] args) throws IOException {
        int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};
        int[] alice = new int[]{5, 25, 50, 120};
        int[] scores2 = new int[]{100, 90, 90, 80, 75, 60};
        int[] alice2 = new int[]{50, 65, 77, 90, 102};
        int[] result = climbingLeaderboard(scores, alice);
        int[] result2 = climbingLeaderboard(scores2, alice2);

        System.out.println("----------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println("----------------");

        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }
    }
}
