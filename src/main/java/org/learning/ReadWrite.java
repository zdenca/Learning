package org.learning;

import javax.swing.*;
import java.io.*;
import java.nio.Buffer;

/**
 * Created by Zdenca on 4/26/2017.
 */
public class ReadWrite {
    public static void main(String[] args) {
//        try (BufferedWriter bfw = new BufferedWriter(new FileWriter("j:\\siddhi\\projects\\Learning\\src\\main\\resources\\read.txt"))) {
//        bfw.write("There is a secret.");
//        bfw.close();
//        try(BufferedReader bfr = new BufferedReader(new FileReader("j:\\siddhi\\projects\\Learning\\src\\main\\resources\\read.txt"))){
//            JOptionPane.showMessageDialog(null,"File contains:\n" + bfr.readLine());
//        try (BufferedWriter bfw = new BufferedWriter(new FileWriter("j:\\\\siddhi\\\\projects\\\\Learning\\\\src\\\\main\\\\resources\\\\read.txt"))) {
//            String[] array = {"Lion", "Tiger", "Jaguar"};
//            for (String a : array) {
//                bfw.write(a + " ");
//            }
//            bfw.flush();
         try(BufferedReader bfr = new BufferedReader(new FileReader("j:\\siddhi\\projects\\Learning\\src\\main\\resources\\read.txt"))){
            String line = "";
            String str = "";
            while ((line = bfr.readLine()) != null) {
                str = str + line + " ";
            }
            bfr.close();
            JOptionPane.showMessageDialog(null, str);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
