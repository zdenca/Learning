package org.learning;

/**
 * Created by Zdenca on 5/5/2017.
 */
public class Ex39 {
    private static int count;

    public static void main(String[] args) {
        String string = "1059";
        String[] array = string.split("");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (k != i && i != j && j != k) {
                        System.out.println(array[i] + array[j] + array[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("total number of the thrree-digit-number is: " + count);


    }

}