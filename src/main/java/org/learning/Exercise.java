package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/2/2017.
 */
public class Exercise {
// convert a binary number to a hexadecimal
    public static void main(String[] args) {
        int n = 1;
        int i = 0;
        int j = 0;
        int rem = 0;
        int dec = 0;
        int hex[] = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        int bin = sc.nextInt();
        if (bin == 0) {
            System.out.println("Output hexadecimal value: " + bin);
        }


        while (bin > 0) {
            rem = bin % 10;
            dec = dec + rem * n;
            n = n * 2;
            bin = bin / 10;
        }
        while (dec != 0) {
            hex[i++] = dec % 16;
            dec = dec / 16;

        }

        for (j = i - 1; j >= 0; j--) {
            if (hex[j] > 9) {
                System.out.print("Output hexadecimal value: ");
                System.out.println((char) (hex[j] + 55));
            } else {
                System.out.print("Output hexadecimal value: ");
                System.out.println(hex[j]);
            }
        }


    }
}
