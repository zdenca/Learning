package org.learning;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Zdenca on 4/18/2017.
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new ReverseComparator().reversed());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String elemnet : ts) {
            System.out.print(elemnet + " ");
        }
        System.out.println();
    }
}
