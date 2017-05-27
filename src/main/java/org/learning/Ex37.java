package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/4/2017.
 */
public class Ex37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set a string: ");
        String str = sc.nextLine();


        String value = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            value = value + str.charAt(i);

        }
        System.out.println(value);
    }

//    This is also possible
//    char[] letters = sc.nexLine().toCharArray();
//    for (int i = letters.length - 1; i >= 0; i--) {
//            System.out.print(letters[i]);
}
