package org.learning;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Zdenca on 7/19/2017.
 */
public class Tutorial {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println(arrayList.get(0));
        System.out.println();

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(arrayList.size() - 1);
        arrayList.remove(0);
        System.out.println();
        for (int number : arrayList) {
            System.out.println(number);
        }
        List<String> values = new ArrayList<>();
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);

    }

    private static void doTimings(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1E5; i++) {
            list.add(list.size() - 100, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
}
