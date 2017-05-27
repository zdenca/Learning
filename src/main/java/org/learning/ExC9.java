package org.learning;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/12/2017.
 */
public class ExC9 {
    private static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Input the year: ");
//        long year = sc.nextLong();
//        if (leapYear(year)) {
//            System.out.println("It is a leap year");
//        }
//        else{
//            System.out.println("It is not a leap year");
//        }
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//        System.out.print("Input a natural number: ");
//        int num = sc.nextInt();
//        int sum = 0;
//        System.out.println("You had set this number: " + num);
//        System.out.println("Natural numbers before your number: ");
//        for(int i = 1; i <= num; i++) {
//            System.out.println(i);
//            sum = sum + i;
//        }
//        System.out.println("Sum of these numbers: " + sum);

//        System.out.println("Input 5 numbers: ");
//
//        int sum  = 0;
//        double avg = 0;
//        for(int i = 0; i < 5; i++) {
//           int num = sc.nextInt();
//            sum = sum + num;
//        }
//        avg = sum/5;
//        System.out.println("Sum is: " + sum);
//        System.out.println("Average is: " + avg);
//
//        System.out.print("Input number of terms: ");
//        int num = sc.nextInt();
//        cube(num);

//        System.out.print("Input number of terms(table to be calculated): ");
//        int term = sc.nextInt();
//        table(term);

//        System.out.print("Input number of terms is: ");
//        int quantity = sc.nextInt();
//        odd(quantity);

        System.out.print("Input number of rows: ");
        int number = sc.nextInt();
//        rows(number);
//        repeatRows(number);
//        triangle(number);
//        pyramid(number);
        diamond(number);

    }

    public static boolean leapYear(long year) {
        boolean a = (year % 4) == 0;
        boolean b = (year % 400) == 0;
        boolean c = (year % 100 != 0);
        if (a && (b || c)) {
            return true;
        } else {
            return false;
        }
    }

    public static void cube(int num) {
        int cube = 0;
        for (int i = 1; i <= num; i++) {
            cube = (int) Math.pow(i, 3);
            System.out.println("Number is : " + i + " and cube of " + i + " is: " + cube);
        }
    }

    public static void table(int term) {
        for (int i = 0; i <= term; i++) {
            System.out.println(term + " x " + i + " = " + (term * i));
        }
    }

    public static void odd(int quantity) {
        int sum = 0;
        count = quantity;
        for (int i = 1; i <= count; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum = sum + i;
                count++;
            }
        }
        System.out.println("Sum of odd numbers is: " + sum);
    }

    public static void rows(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void repeatRows(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void triangle(int number) {
        int k = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int number) {
        int space = number;
        int blank = 0;
        for (int i = 1; i <= number; i++) {
            for (blank = space; blank != 0; blank--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            space--;
        }
    }

    public static void diamond(int number) {
        int i = 0;
        int j = 0;

        for (i = 0; i <= number; i++) {
            for (j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (i = number - 1; i >= 0; i--) {
            for (j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i -1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}





