package com.challenges;

import java.io.*;

import java.util.*;


public class TheTimeInWords {

    static String[] nums = new String[]{"o' clock", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen"};
    static String[] decimals = new String[]{"", "teen", "twenty", "thirty", "fourty", "fifty"};
    static int[] decimalInts = new int[]{0, 10, 20, 30, 40, 50};
    static String past = "past";
    static String to = "to";
    static String half = "half";
    static String quarter = "quarter";
    static String mMin = "minute";
    static String mMins = "minutes";

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String timeresult = "";
        String minutes = "";
        String hours = "";
        if (m == 0) {
            minutes = nums[0];
            hours = nums[h];
            timeresult = hours.concat(" ").concat(minutes);
        } else if (m == 1) {
            minutes = nums[m];
            hours = nums[h];
            timeresult = minutes.concat(" ").concat(mMin).concat(" ").concat(past).concat(" ").concat(hours);
        } else if (m == 15) {
            minutes = quarter.concat(" ").concat(past);
            hours = nums[h];
            timeresult = (minutes).concat(" ").concat(hours);
        } else if (m == 30) {
            minutes = half.concat(" ").concat(past);
            hours = nums[h];
            timeresult = minutes.concat(" ").concat(hours);
        } else if (m == 45) {
            minutes = quarter.concat(" ").concat(to);
            hours = nums[h + 1];
            timeresult = (minutes).concat(" ").concat(hours);
        } else if (m > 1 && m < 30) {
            String mins = String.valueOf(m);
            if (mins.length() == 2 && m >= 20) {
                if (mins.startsWith("2")) {
                    minutes = decimals[2];
                    int restMins = m - decimalInts[2];
                    minutes = minutes.concat(" ").concat(nums[restMins]).concat(" ").concat(mMins);

                }

            } else {
                minutes = nums[m];
                minutes = minutes.concat(" ").concat(mMins);

            }
            hours = nums[h];
            timeresult = minutes.concat(" ").concat(past).concat(" ").concat(hours);

        } else if (m > 30 && m < 60) {
            if (Integer.valueOf(m).toString().startsWith("3")) {
                int restMins = 60 - m;// decimalInts[3];
                if (String.valueOf(restMins).startsWith("2")) {
                    restMins = restMins - decimalInts[2];
                    minutes = decimals[2];// .concat(" ").concat(nums[restMins]);
                }
                minutes = minutes.concat(" ").concat(nums[restMins]).concat(" ").concat(mMins);
            } else if (Integer.valueOf(m).toString().startsWith("4")) {
                int restMins = 60 - m;
                minutes = minutes.concat("").concat(nums[restMins]).concat(" ").concat(mMins);
            } else if (Integer.valueOf(m).toString().startsWith("5")) {
                int restMins = 60 - m;
                minutes = minutes.concat("").concat(nums[restMins]).concat(" ").concat(mMins);
            }

            hours = nums[h + 1];
            timeresult = minutes.concat(" ").concat(to).concat(" ").concat(hours);
        }

        return timeresult;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
