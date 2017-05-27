package org.learning;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by Zdenca on 5/23/2017.
 */
public class ExFiles2 {


    private static String path = "j:\\siddhi\\projects\\books\\list.txt";
    private static String content = "";
    private static int count = 1;

    public static void main(String[] args) throws Exception {
//        findLongestWords();
        System.out.println(longestWord(path));
        StringBuilder sb = new StringBuilder();
        List<String> arrrayList = new ArrayList<>();
        try (FileWriter fw = new FileWriter(path)) {
            fw.write("1234567890\n");
            fw.write("abcdefghchijk\n");
            fw.write("budeme mit k obedu kure\n");
            fw.write("musim sehnat malou baterku\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader bfr = new BufferedReader(new FileReader(path))) {
            String line;
            while (((line = bfr.readLine()) != null) && count <= 3) {
                arrrayList.add(line);
//                content = content + line;
//                sb.append(line);
//                sb.append(System.lineSeparator());
                count++;

            }
            System.out.println(arrrayList);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String findLongestWords() throws FileNotFoundException {

        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File(path));


        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }

        }
        System.out.println("\n" + longest_word + "\n");
        return longest_word;
    }

    public static String longestWord(String path) throws Exception {
        String result = "";
        String line = "";

        try (BufferedReader bfr = new BufferedReader(new FileReader(path))) {
            while ((line = bfr.readLine()) != null) {
                String[] str = line.split(" ");
                for (int i = 0; i < str.length; i++) {
                    if (str[i].length() > result.length()) {
                        result = str[i];
                    }
                }
            }
        }
        return result;
    }
}
