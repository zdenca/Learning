package org.learning;

import java.util.Comparator;

/**
 * Created by Zdenca on 7/19/2017.
 */
public class AlphabeticalComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
