package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/2/2017.
 */
public class Exercise3 {
        // convert a binary number to an octal
    public static void main(String[] args) {
        long dec = 0;
        long remainder = 0;
        int n = 1;
        int j = 0;
        int i = 0;
        long oct[] = new long[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        long bin = sc.nextLong();

        while (bin > 0) {
            remainder = bin % 10;
            dec = dec + remainder * n;
            n = n * 2;
            bin = bin / 10;

        }
        while (dec != 0) {
            oct[i++] = dec % 8;
            dec = dec / 8;
        }
        System.out.print("Output an octal number is: ");
        for (j = i - 1; j >= 0; j--) {
            System.out.print(oct[j]);
        }
        System.out.println();

        //convert on octal to a decimal number
        System.out.print("Input an octal number: ");
        long octal = sc.nextLong();
        long deci = 0;
        int a = 0;
        long rem = 0;
        i = 0;
        j = 0;
        long binNum[] = new long[100];
        while (octal != 0) {
            rem = octal % 10;
            deci = (long) (deci + rem * Math.pow(8, a++));
            octal = octal / 10;
        }
        System.out.println("Output a decimal value is: " + deci);

        //convert ano octal number to a binary

        while (deci != 0) {
            binNum[i++] = deci % 2;
            deci = deci / 2;
        }
        System.out.print("Output a binary value is: ");
        for (j = i - 1; j >= 0; j--) {
            System.out.print(binNum[j]);
        }


    }
}
