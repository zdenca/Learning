package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/3/2017.
 */
public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set a first number: ");
        int first = sc.nextInt();
        System.out.print("Set a second number: ");
        int second = sc.nextInt();

        if (first != second) {
            System.out.println(first + " != " + second);
            if (first <= second) {
                System.out.println(first + " <= " + second);
            }
            if (first < second) {
                System.out.println(first + " < " + second);
            }
            if (first >= second) {
                System.out.printf("%d >= %d\n", first, second);
            }
            if (first > second) {
                System.out.printf("%d > %d\n", first, second);
            }
        }
        if (first == second) {
            System.out.println(first + " = " + second);
        }
    }
}
