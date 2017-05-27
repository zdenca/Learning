package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/11/2017.
 */
public class ExC8 {
    private static String consonant = "bcdfghjklmnprstvwxz";
    private static String vowel = "aeiouy";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String ch = sc.nextLine();
        print(ch);
    }

    public static void print(String ch) {
        ch = ch.toLowerCase();
        if (ch.length() > 1) {
            System.out.println("Error message - input only one letter");
        } else if (consonant.contains(ch)) {
            System.out.println("Input letter is Consonant");
        } else if (vowel.contains(ch)) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Error message - it is not a letter");
        }


    }
}
