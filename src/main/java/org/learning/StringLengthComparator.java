package org.learning;

import java.util.Comparator;

/**
 * Created by Zdenca on 7/19/2017.
 */
public class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        }
            return 0;
        }
    }

