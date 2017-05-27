package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/2/2017.
 */
public class Exercise1 {
    // convert a decimal number to a hexadecimal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hex[] = new int[40];
        int i = 0;
        int j = 0;

        System.out.print("Input decimal number: ");
        int dec = sc.nextInt();

        while (dec != 0) {
            hex[i++] = dec % 16;
            dec = dec / 16;

        }
        System.out.print("Output hexadecimal number is: ");
        for (j = i - 1; j >= 0; j--) {
            if (hex[j] > 9) {
                System.out.print((char) (hex[j] + 55));
            } else {
                System.out.print(hex[j]);
            }

        }

//        convert a decimal number to an octal ant a hexadecimal number
//        through the use of (via) System.out.printf();
//        not convert to a binary number

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Set a decimal number: ");
//        int num = sc.nextInt();
//        System.out.printf("An octal number = %o%n", num);
//        System.out.printf("A hexadecimal number = %X%n", num);
//        System.out.printf("A hexadecimal number = %x%n", num);


    }
}