package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/2/2017.
 */
public class Exercise2 {
    //    convert a binary number to a decimal
    public static void main(String[] args) {
        int remainder = 0;
        int n = 0;
        int dec = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binay number: ");
        int bin = sc.nextInt();

        while (bin > 0) {
            remainder = bin % 10;
            dec = (int) (dec + remainder * Math.pow(2, n++));
//          dec = dec + remainder * n;
//            n = n * 2;

            bin = bin / 10;
        }
        System.out.println("Output a decimal value: " + dec);


    }

}
