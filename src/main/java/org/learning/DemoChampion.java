package org.learning;

/**
 * Created by Zdenca on 4/27/2017.
 */
public class DemoChampion {
    public static void main(String[] args) {
        Cube cube = new Cube(10);
        Champion al = new Champion("Al", 100, 20, 10, cube);
        Champion shadow = new Champion("Shadow", 60, 18, 15, cube);
        Arena arena = new Arena(al, shadow, cube);
        arena.fight();
    }
}
