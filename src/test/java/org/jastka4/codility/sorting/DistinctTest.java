package org.jastka4.codility.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DistinctTest {

    private final Distinct distinct = new Distinct();

    @Test
    void solutionSimpleArray() {
        int[] A = {2, 1, 1, 2, 3, 1};
        int solution = 3;

        Assertions.assertEquals(solution, distinct.solution(A));
    }

    @Test
    void solution2SimpleArray() {
        int[] A = {2, 1, 1, 2, 3, 1};
        int solution = 3;

        Assertions.assertEquals(solution, distinct.solution2(A));
    }

    @Test
    void solutionEmptyArray() {
        int[] A = {};
        int solution = 0;

        Assertions.assertEquals(solution, distinct.solution(A));
    }

    @Test
    void solution2EmptyArray() {
        int[] A = {};
        int solution = 0;

        Assertions.assertEquals(solution, distinct.solution2(A));
    }
}