package org.learning;

import java.util.Comparator;

/**
 * Created by Zdenca on 4/18/2017.
 */
public class TComp implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int i, j, k;

//        find index of beginning of last name
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));

        if (k == 0) {
            return aStr.compareToIgnoreCase(bStr);
        } else {
            return k;
        }
    }
}
