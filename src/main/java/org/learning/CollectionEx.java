package org.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 * Created by Zdenca on 5/18/2017.
 */
public class CollectionEx {
    public static void main(String[] args) {
        ArrayList<Pear> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            arrayList.add(new Pear(i + 20));
        }
        for(Iterator<Pear> iterator = arrayList.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
        Iterator<Pear> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
        System.out.println();
    }

}
