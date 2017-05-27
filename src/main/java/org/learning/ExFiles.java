package org.learning;

import java.io.File;
import java.io.FilenameFilter;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by Zdenca on 5/16/2017.
 */
public class ExFiles {
    public static void main(String[] args) {
        File file = new File("c:\\users\\zdenca\\downloads\\danielle_steel");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
        System.out.println();

        File fileS = new File("c:\\users\\zdenca\\downloads");
        String[] list = fileS.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".gif")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (String suffix : list) {
            System.out.println(suffix);
        }

        File fileExist = new File("c:\\users\\zdenca\\downloads\\danielle_steel");
        if (fileExist.exists()) {
            System.out.println("The directory or file exists");
        } else {
            System.out.println("The directory or file does not exist");
        }
        if (fileExist.canRead()) {
            System.out.println("The directory or file can read");
        } else {
            System.out.println("The directory or file can not read");
        }
        if (fileExist.canWrite()) {
            System.out.println("The directory or file can write");
        } else {
            System.out.println("The directory or file can not write");
        }
        if (fileExist.isFile()) {
            System.out.println(fileExist.getAbsolutePath() + " is a file");
        } else {
            System.out.println(fileExist.getAbsolutePath() + " is a directory");
        }


        System.out.println(fileExist.compareTo(file));
        File last = new File("j:\\siddhi\\projects\\books\\list.txt");
        Date date = new Date(last.lastModified());
        System.out.println(date);



    }
}
