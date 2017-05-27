package org.learning;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Zdenca on 5/3/2017.
 */
public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set a number: ");
        long num = sc.nextLong();
        System.out.println("Sum of digits is: " + sum(num));

        System.out.print("Set another number: ");
        String str = sc.next();
        sc.nextLine();
        String value;
        int sum = 0;
        String array[] = str.split("");
//        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++) {
            value = array[i];
            sum = sum + Integer.parseInt(value);
        }
        System.out.println(sum);

    }


    public static int sum(long num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }


}
