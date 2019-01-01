package com.challenges;


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */

        String newTime = s.substring(0, s.length() - 2);
        int hoursToConvert = Integer.valueOf(s.substring(0, 2));

        if (s.startsWith("12") && s.endsWith("AM")) {
            newTime = newTime.substring(2, newTime.length());
            newTime = "00".concat(newTime);
        } else if (s.startsWith("12") && s.endsWith("PM")) {
            newTime = newTime.substring(2, newTime.length());
            newTime = "12".concat(newTime);
        } else if (s.contains("PM")) {
            int convertedHours = hoursToConvert + 12;
            newTime = newTime.substring(2, newTime.length());
            newTime = String.valueOf(convertedHours).concat(newTime);
        } else {
            return newTime;
        }
        return newTime;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}


