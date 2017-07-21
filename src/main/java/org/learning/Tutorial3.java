package org.learning;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Zdenca on 7/19/2017.
 */
public class Tutorial3 {
    public static void main(String[] args) {
//        Set<String> hashset = new HashSet<>();
//        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("cat");
        treeSet.add("mouse");
        treeSet.add("dog");
        treeSet.add("snake");
        treeSet.add("bear");


        System.out.println(treeSet);

        for (String element : treeSet) {
            System.out.println(element);
        }
        if (treeSet.contains("cat")) {
            System.out.println("Contains cat");
        }
        if (treeSet.contains("bubu")) {
            System.out.println("Contains bubu");
        }
        if (treeSet.isEmpty()) {
            System.out.println("TreeSet is empty");
        }
        int hashCode = treeSet.hashCode();
        System.out.println(hashCode);

        Set<String> set = new TreeSet<>();
        set.add("cat");
        set.add("mouse");
        set.add("giraffe");
        set.add("monkey");
        set.add("ant");

        Set<String> intersection = new HashSet<>(treeSet);
        intersection.retainAll(set);
        System.out.println(intersection);


        Set<String> difference = new HashSet<>(set);
        difference.removeAll(treeSet);
        System.out.println(difference);
    }
}
