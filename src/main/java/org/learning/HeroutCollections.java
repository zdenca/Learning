package org.learning;

import java.util.ArrayList;

/**
 * Created by Zdenca on 5/16/2017.
 */
public class HeroutCollections {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add(new Integer(5));
        print(arrayList);
    }

    public static void print(ArrayList<?> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Object o = arrayList.get(i);
            if (o instanceof String) {
                System.out.println(o.toString());
            }
            if (o instanceof Integer) {
                System.out.println(((Integer) o).intValue());
            }
        }
    }
}
