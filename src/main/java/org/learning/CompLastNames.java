package org.learning;

import java.util.Comparator;

/**
 * Created by Zdenca on 4/18/2017.
 */
public class CompLastNames implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int i, j;

        i = a.lastIndexOf(' ');
        j = b.lastIndexOf(' ');

        return a.substring(i).compareToIgnoreCase(b.substring(j));
    }
}
