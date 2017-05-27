package org.learning;

import java.util.Random;

/**
 * Created by Zdenca on 4/26/2017.
 */
public class Cube {
    private int numberWallsOfCube;
    private Random random;

    public Cube(int numberWallsOfCube) {
        this.numberWallsOfCube = numberWallsOfCube;
        random = new Random();
    }

    public int getNumberWallsOfCube() {
        return numberWallsOfCube;
    }

    public int throwCube() {
        return random.nextInt(numberWallsOfCube) + 1;
    }


    public static void main(String[] args) {
        Cube cube10 = new Cube(10);
        Cube cube6 = new Cube(6);
        System.out.println(cube10.getNumberWallsOfCube());
        System.out.println(cube6.getNumberWallsOfCube());
        System.out.println(cube6.throwCube());
        System.out.println(cube10.throwCube());
        System.out.println();
        for (int i = 0; i < 40; i++) {
            System.out.print(cube6.throwCube() + " ");
        }
        System.out.println();

    }

}
