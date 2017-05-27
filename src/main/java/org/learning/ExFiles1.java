package org.learning;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Zdenca on 5/17/2017.
 */
public class ExFiles1 {


    public static void main(String[] args) throws IOException {
//        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Input your name: ");
//        try {
//            String name = bfr.readLine();
//            System.out.println("Your name is: " + name);
//            bfr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        File file = new File("j:\\siddhi\\projects\\books\\list.txt");
//        long size = file.length();
//        System.out.println(size + " bytes");
//        System.out.println(kiloBytes(size));
//        System.out.println(megaBytes(size));
//
        String path = "j:\\siddhi\\projects\\books\\list.txt";
//        InputStream ips = null;
//        try {
//            ips = new FileInputStream(path);
//            byte[] content = new byte[2 * 1024];
//            int readCount = 0;
//            while ((readCount = ips.read(content)) > 0) {
//                System.out.println(new String(content, 0, readCount));
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        } finally {
//            if (ips != null) {
//                ips.close();
//
//            }
        try (BufferedReader bfr = new BufferedReader(new FileReader(path))) {
            String line = null;
            ArrayList<String> arrayList = new ArrayList<>();
            while ((line = bfr.readLine()) != null) {
               arrayList.add(line);

            }

            System.out.println(arrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        StringBuilder sb = new StringBuilder();
//        String strLine = "";
//        try (BufferedReader bfr = new BufferedReader(new FileReader(path))) {
//            while (strLine != null) {
//                sb.append(strLine);
//                sb.append(System.lineSeparator());
//                strLine = bfr.readLine();
//                System.out.println(strLine);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

    public static String kiloBytes(long size) {
        return (double) size / 1024 + " kb";
    }

    public static String megaBytes(long size) {
        return (double) size / (1024 * 1024) + " Mb";
    }


}
