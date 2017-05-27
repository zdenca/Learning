package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 4/28/2017.
 */
public class Herout {
    public static Scanner sc = new Scanner(System.in);

    public static void divide(double a, double b) {
        if (a / b == Double.POSITIVE_INFINITY) {
            System.out.println("The result is a positive infinity");
        } else if (a / b == Double.NaN) {
            System.out.println("The result is not a number");
        } else if (a / b == Double.NEGATIVE_INFINITY) {
            System.out.println("The result is a negative infinity");
        } else {
            System.out.println(a / b);
        }


    }

    public static void printNumber() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is greater number  " + b + " is smaller number");
        } else if (a < b) {
            System.out.println(a + " is smaller number  " + b + " is greater number");
        } else if (a == b) {
            System.out.println(a + " = " + b);
        }
        System.out.println();

        System.out.println(a > b ? a + " is greater number " + b + " is smaller number" : a + " is smaller number " + b + " is greater number" );


    }


    public static char readChar() {
        System.out.print("Enter a char: ");
        char c = sc.nextLine().charAt(0);
        return c;
    }

    public static void printChar() {
        char c = readChar();
        System.out.format("Next char is %c%n", (c + 1) - 32);
        System.out.printf("Char %c has ASCII value: %d%n", (c + 1) - 32, (((c + 1)) - 32));
    }


    public static void main(String[] args) {
//        divide(0,0);
//       printChar();
        printNumber();


    }
}
