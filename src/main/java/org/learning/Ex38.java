package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/4/2017.
 */
public class Ex38 {
    private static int countN;
    private static int countL;
    private static int countS;
    private static int other;
    private static String letters = "abcdefghijklmnopqrstuvwxyz";
    private static String numbers = "0123456789";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] str = sc.nextLine().toCharArray();
        System.out.println(str.length);
        numOfLetters(str);
        System.out.println();
        count(str);


    }

    public static void numOfLetters(char[] str) {
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                countS++;
            }
            if (letters.contains(String.valueOf(str[i]))) {
                countL++;
            }
            if (numbers.contains(String.valueOf(str[i]))) {
                countN++;
            }

        }
        other = str.length - (countS + countL + countN);
        System.out.print("Letter: " + countL + "\nNumber: " +
                countN + "\nSpace: " + countS + "\nOther: " + other);


    }

    public static void count(char[] str) {
        int letter = 0;
        int space = 0;
        int num = 0;
        int o = 0;
        for (int i = 0; i < str.length; i++) {
            if (Character.isLetter(str[i])) {
                letter++;
            } else if (Character.isDigit(str[i])) {
                num++;
            } else if (Character.isSpaceChar(str[i])) {
                space++;
            }else {
                o++;
            }

        }
        System.out.print("\nletter: " + letter + "\nspace: " + space +
        "\nnumber: " + num + "\nother: " + o);
    }
}
