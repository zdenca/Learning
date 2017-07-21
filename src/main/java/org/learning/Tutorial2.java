package org.learning;

import com.sun.javafx.collections.MappingChange;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Zdenca on 7/19/2017.
 */
public class Tutorial2 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

//        hashMap.put(1, "Jaunar");
//        hashMap.put(2, "Februar");
//        hashMap.put(3, "October");
//        hashMap.put(3, "March");
//        hashMap.put(9, "September");
//        hashMap.put(11, "November");
//        hashMap.put(12, "December");

        System.out.println(hashMap);

        String valueText = hashMap.get(5);
        System.out.println(valueText);


        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);


        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
        System.out.println("Size of map: " + hashMap.size());
        treeMap.put(1, "hihi");
        treeMap.put(2, "hi");
        treeMap.put(3, "hello");
        hashMap.putAll(treeMap);

        System.out.println("After put all: " + hashMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "dog");
        map.put(8, "cat");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
        System.out.println();
    }

}
