package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/3/2017.
 */
public class Exercise5 {
    // convert a hexadecimal to a decimal number
    public static int hexaToDecimal(String s) {
        String digits = "0123456789ABCDEF";

        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deci = 0;
        int dec = 0;
        int bin[] = new int[100];
        int i = 0;
        int j = 0;
        System.out.print("Input a hexadecimal number: ");
        String hexa = sc.nextLine();

        deci = hexaToDecimal(hexa);

        System.out.print("Output a decimal value is: " + deci);
        System.out.println();
//        convert a hexadecimal to a binary number
        while (deci != 0) {
            bin[i++] = deci % 2;
            deci = deci / 2;
        }
        System.out.print("Output a binary value is: ");
        for (j = i - 1; j >= 0; j--) {
            System.out.print(bin[j]);
        }
        System.out.println();
//      convert a hexadecimal to a octal number
        int oct[] = new int[100];
        i = 0;
        j = 0;
        dec = hexaToDecimal(hexa);
        while (dec != 0) {
            oct[i++] = dec % 8;
            dec = dec / 8;
        }
        System.out.print("Output an octal value is: ");
        for (j = i - 1; j >= 0; j--) {
            System.out.print(oct[j]);
        }
    }
}