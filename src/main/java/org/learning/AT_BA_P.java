package org.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Zdenca on 5/16/2017.
 */
public class AT_BA_P {
    public static void main(String[] args) {
        ArrayList<T> arrayList = new ArrayList<>();
        arrayList.add(new AT());
        arrayList.add(new BA());
        print(arrayList);


    }

    public static void print(ArrayList<? extends T> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).print();
        }

    }

}
