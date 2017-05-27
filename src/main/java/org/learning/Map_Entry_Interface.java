package org.learning;

import java.util.*;

/**
 * Created by Zdenca on 4/18/2017.
 */
public class Map_Entry_Interface {
    static CompLastNames compLN = new CompLastNames();
    static Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());
    static Map<String, Integer> map = new TreeMap<>(compLN);

    public static void fillMap() {
        map.put("John Doe", new Integer(1234));
        map.put("Tom Smith", new Integer(-1234));
        map.put("Jane Baker", new Integer(567));
        map.put("Tod Hall", new Integer(978));
        map.put("Ralph Smith", new Integer(32));
    }

    public static void printMap() {
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
        System.out.println();

    }

    public static void main(String[] args) {
        fillMap();
        printMap();


    }

}
