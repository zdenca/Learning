package org.learning;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by Zdenca on 5/5/2017.
 */
public class ExD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Input a degree in Fahrenheit: ");
//        double fah = sc.nextDouble();
//        System.out.printf("%.1f%n", celsius(fah));
//
//        System.out.print("Input a value for inch: ");
//        double inch = sc.nextDouble();
//        System.out.printf("%.1f%n", meter(inch));
//
//        System.out.print("Input the number of minutes: ");
//        long minutes = sc.nextLong();
//        System.out.println(year(minutes) + " years");
//        System.out.println(day(minutes) + " days ");
//
//        System.out.print("Input the time zone offset to GMT: ");
//        long timeZoneChange = sc.nextInt();
//        time(timeZoneChange);


//        System.out.print("Input weight in pounds: ");
//        double weight = sc.nextDouble();
//        System.out.print("Input height in inches: ");
//        double height = sc.nextDouble();
//        System.out.println("Body Mass Index is: " +  bodyMassIndex(weight, height));


//        System.out.print("Input distance in meters: ");
//        long distance = sc.nextLong();
//        System.out.print("Input hour: ");
//        long hours = sc.nextLong();
//        System.out.print("Input minutes: ");
//        long minutes = sc.nextLong();
//        System.out.print("Input seconds: ");
//        long seconds = sc.nextLong();
//        speed(distance, hours, minutes, seconds);

//        System.out.print("Input any number: ");
//        double num = sc.nextDouble();
//        power(num);

//        System.out.print("Input first integer: ");
//        int num1 = sc.nextInt();
//        System.out.print("Input second integer: ");
//        int num2 = sc.nextInt();
//        System.out.println("Sum of two integers: " + (num1 + num2));
//        System.out.println("Difference of two integers: " + (num1 - num2));
//        System.out.println("Product of two integers: " + (num1 * num2));
//        System.out.println("Average of two integers: " + ((double) (num1 + num2) / 2));
//        System.out.println("Distance of two integers: " + Math.abs(num1 - num2));
//        System.out.println("Max integer: " + max(num1, num2));
//        System.out.println("Min integer: " + min(num1, num2));
//        System.out.println(Math.max(num1, num2));
//        System.out.println(Math.min(num1, num2));
        System.out.print("Input six non-negative digits: ");
//        String string = sc.nextLine();
//        String replace = string.replace("", " ");
//        System.out.println(replace);
        int num = sc.nextInt();
        int n1 = num / 100000 % 10;
        int n2 = num / 10000 % 10;
        int n3 = num / 1000 % 10;
        int n4 = num / 100 % 10;
        int n5 = num / 10 % 10;
        int n6 = num % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
    }

    public static double celsius(double fah) {
        double cel = 5 * (fah - 32) / 9;
        return cel;
    }

    public static double meter(double inch) {
        return inch * 0.0254;
    }

    public static long year(long minutes) {
        long year = minutes / 60 / 24 / 365;
        return year;
    }

    public static long day(long minutes) {
        long day = (minutes / 60 / 24) % 365;
        return day;
    }

    // output is a curent time:
    public static void time(long timeZoneChange) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = (totalHours + timeZoneChange) % 24;
        System.out.print(currentHours + " : " + currentMinutes + " : " + currentSeconds);

    }

    public static double bodyMassIndex(double weight, double height) {
        double bmi = weight * 0.454 / Math.pow(meter(height), 2);
        return bmi;
    }

    public static void speed(long distance, long hours, long minutes, long seconds) {
        double timeSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double meterPerSecond = distance / timeSeconds;
        System.out.println("Your speed in meters/second is " + meterPerSecond);
        double kmPerHour = (distance / timeSeconds) * 3.6;
        System.out.println("Your speed in km/h is " + kmPerHour);
        double milesPerHour = kmPerHour / 1.609344;
        System.out.println("Your speed in miles/h is " + milesPerHour);
    }

    public static void power(double num) {
        System.out.printf("Square = %.2f%n", num * num);
        System.out.printf("Cube = %.2f%n", Math.pow(num, 3));
        System.out.printf("Forth power = %.2f%n", Math.pow(num, 4));
    }

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int min(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
