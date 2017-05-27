package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/4/2017.
 */
public class Ex34 {
    private static double area = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set the length of a side of the hexagon: ");
        int s = sc.nextInt();
        System.out.print("Set the length of a side of the polygon: ");
        int a = sc.nextInt();
        System.out.print("Set the number of sides on the polygon: ");
        int numOfSides = sc.nextInt();
        System.out.println("The area of the hexagon is: " + areaOfHexa(s));
        System.out.println("The area of the polygon with " + numOfSides + " sides is: " + areaOfPolygon(a,numOfSides));


    }

    public static double areaOfHexa(int s) {
        area = (6 * Math.pow(s, 2)) / (4 * (Math.tan(Math.PI / 6)));

        return area;
    }

    public static double areaOfPolygon(int a, int numOfSides) {
        area = (numOfSides * (a * a)) / (4 * (Math.tan(Math.PI / numOfSides)));
        return area;
    }
}
