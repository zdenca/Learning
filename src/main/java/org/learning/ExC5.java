package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/10/2017.
 */
public class ExC5 {
    private static String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = sc.nextInt();
        System.out.println(week(num));
    }

    public static String week(int num) {
        if (num >= 0 && num <= week.length) {
            String result = week[num - 1];
            return result;
        } else
            return "Input number between 1 and 7";


    }
}
