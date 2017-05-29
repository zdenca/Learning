package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/29/2017.
 */
public class ExNum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the third number: ");
        int num3 = sc.nextInt();
        System.out.println(smallestNumber(num1, num2, num3));

    }

    public static int smallestNumber(int num1, int num2, int num3) {
//        return Math.min(Math.min(num1, num2),num3);
        if ((num1 < num2) && (num1 < num3)) {
            return num1;
        }
        if ((num2 < num1) && (num2 < num3)) {
            return num2;
        } else {
            return num3;
        }
    }
}
