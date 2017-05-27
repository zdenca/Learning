package org.learning;

import java.util.Comparator;

/**
 * Created by Zdenca on 4/18/2017.
 */
public class CompThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int i, j;
        return a.compareToIgnoreCase(b);

    }
}
