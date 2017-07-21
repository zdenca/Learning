package org.learning;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Zdenca on 7/19/2017.
 */
public class Tutorial4 {
    public static void main(String[] args) {

        PersonT p1 = new PersonT(0, "Bob");
        PersonT p2 = new PersonT(1, "Sue");
        PersonT p3 = new PersonT(2, "Mike");
        PersonT p4 = new PersonT(1, "Sue");


        Map<PersonT, Integer> map = new HashMap<>();

        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 1);

        for (PersonT key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println(map);
        Set<PersonT> set = new LinkedHashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);
    }
}
