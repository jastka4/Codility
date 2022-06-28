package org.jastka4.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public int solution(int[] A) {
        int min = 1;
        final Set<Integer> seen = new HashSet<>();
        for (int value : A) {
            if (value > 0) seen.add(value);
        }
        while (seen.contains(min)) {
            min++;
        }
        return min;
    }
}
