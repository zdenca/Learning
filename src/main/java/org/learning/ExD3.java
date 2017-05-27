package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/5/2017.
 */
public class ExD3 {
    private static int sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number between 0 and 1000: ");
        int num = sc.nextInt();

        System.out.print("Sum of all digits in " + num + " is " + sum(num));
    }

    public static int sum(int num) {
        while (num > 0 && num < 1000) {
            sum = sum + num % 10;
            num = num / 10;
        }

        return sum;
    }


}
