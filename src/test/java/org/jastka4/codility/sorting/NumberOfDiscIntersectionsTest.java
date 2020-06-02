package org.jastka4.codility.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfDiscIntersectionsTest {

    private final NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();

    @Test
    void solution() { // TODO
        int[] A = {1, 5, 2, 1, 4, 0};
        int solution = 11;

        Assertions.assertEquals(solution, numberOfDiscIntersections.solution(A));
    }

    @Test
    void name() { // TODO
        int[] A = {1, 2147483647, 0};
        int solution = 2;

        Assertions.assertEquals(solution, numberOfDiscIntersections.solution(A));
    }

    // TODO - add test where start point == end point
}