package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/3/2017.
 */
public class Exercise4 {
//    convert an octal number to a hexadecimal number:
//    in two steps: 1. octal to binary, 2. binary to hexadecimal

    public static void main(String[] args) {
        String octal;
        String hex;
        int dec;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an octal number: ");
        octal = sc.nextLine();
        dec = Integer.parseInt(octal,8);
        hex = Integer.toHexString(dec);
        System.out.print("Output a hexadecimal value is : " + hex + "\n");
    }
}
