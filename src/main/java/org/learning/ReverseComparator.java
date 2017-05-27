package org.learning;

import java.util.Comparator;

/**
 * Created by Zdenca on 4/18/2017.
 */
public class ReverseComparator implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
//         reverse the comparison
        return aStr.compareTo(bStr);
    }

    Comparator<String> rc = (aStr, bStr) -> bStr.compareTo(aStr);

}
