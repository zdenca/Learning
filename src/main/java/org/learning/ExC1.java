package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/10/2017.
 */
public class ExC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Input number: ");
//        int num = sc.nextInt();
//        negPos(num);

//        System.out.print("Input a: ");
//        int a = sc.nextInt();
//        System.out.print("Input b: ");
//        int b = sc.nextInt();
//        System.out.print("Input c: ");
//        int c = sc.nextInt();
//        roots(a, b, c);

//        System.out.print("Input first number: ");
//        int a = sc.nextInt();
//        System.out.print("Input second number: ");
//        int b = sc.nextInt();
//        System.out.print("Input third number: ");
//        int c = sc.nextInt();
//        System.out.println(greatest(a, b, c));


//        System.out.print("Input a number: ");
//        double num = sc.nextDouble();
//                process(num);
//        System.out.print("Input a floating-point number: ");
//        double num1 = sc.nextDouble();

//        System.out.print("Input another floating-point number: ");
//        double num2 = sc.nextDouble();
//        match(num1, num2);


        System.out.print("Input a month number: ");
        int month = sc.nextInt();
        System.out.print("Input a year: ");
        int year = sc.nextInt();
        numberOfdays(month, year);
    }

    public static void negPos(int num) {
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

    }

    public static void roots(int a, int b, int c) {
        double dis = (b * b) - (4 * a * c);
        if (dis > 0) {
            double x1 = (-b + Math.sqrt(dis)) / 2 * a;
            double x2 = (-b - Math.sqrt(dis)) / 2 * a;
            System.out.println("The roots are: " + x1 + " " + x2);
        } else if (dis == 0) {
            double x1 = -b / (2 * a);
            System.out.println("The root is: " + x1);
        } else {
            System.out.println("The equation has not a resolution");

        }


    }

    public static int greatest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void process(double num) {
        if (num > 0) {
            if (Math.abs(num) < 1) {
                System.out.println("Positive small number");
            } else if (Math.abs(num) > 1000000) {
                System.out.println("Positive large number");
            } else {
                System.out.println("Positive number");
            }
        } else if (num < 0) {
            if (Math.abs(num) < 1) {
                System.out.println("Negative small number");
            } else if (Math.abs(num) > 1000000) {
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative number");
            }

        } else {
            System.out.println("It is zero");
        }
    }

    public static void match(double num1, double num2) {
        num1 = Math.round(num1 * 1000);
        num1 = num1 / 1000;

        num2 = Math.round(num2 * 1000);
        num2 = num2 / 1000;

        if (num1 == num2) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");

        }
    }

    public static void numberOfdays(int month, int year) {
        String nameOfMonth = "";
        int numOfdays = 0;
        switch (month) {
            case 1:
                nameOfMonth = "January";
                numOfdays = 31;
                break;
            case 2:
                nameOfMonth = "February";
                // leap year
                if ((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)) {
                    numOfdays = 29;
                } else {
                    numOfdays = 28;
                }
                break;
            case 3:
                nameOfMonth = "March";
                numOfdays = 31;
                break;
            case 4:
                nameOfMonth = "April";
                numOfdays = 30;
                break;
            case 5:
                nameOfMonth = "May";
                numOfdays = 31;
                break;
            case 6:
                nameOfMonth = "June";
                numOfdays = 30;
                break;
            case 7:
                nameOfMonth = "July";
                numOfdays = 31;
                break;
            case 8:
                nameOfMonth = "August";
                numOfdays = 31;
                break;
            case 9:
                nameOfMonth = "September";
                numOfdays = 30;
                break;
            case 10:
                nameOfMonth = "October";
                numOfdays = 31;
                break;
            case 11:
                nameOfMonth = "November";
                numOfdays = 30;
                break;
            case 12:
                nameOfMonth = "December";
                numOfdays = 31;
            default:
                System.out.println("Incorrect number of month");
                break;

        }
        System.out.println(nameOfMonth + " has " + numOfdays + " days");
    }
}

