package org.learning;

import java.util.Scanner;

/**
 * Created by Zdenca on 5/4/2017.
 */
public class Ex36 {
    private static double d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double lon1 = sc.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double lon2 = sc.nextDouble();
        System.out.println("Distance between two points is: " + distanceBetweenTwoPoints(lat1, lon1, lat2, lon2) + " km");

    }

    public static double distanceBetweenTwoPoints(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        double radOfEarth = 6371.01;

        d = radOfEarth * Math.acos(Math.sin(lat1)* Math.sin(lat2) + Math.cos(lat1)* Math.cos(lat2)* Math.cos(lon1-lon2));
        return d;
    }
}
