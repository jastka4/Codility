package org.jastka4.codility.countingelements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxCountersTest {

    private final MaxCounters maxCounters = new MaxCounters();

    @Test
    void solution() {
        final int[] A = {3, 4, 4, 6, 1, 4, 4};
        final int N = 5;
        final int[] solution = {3, 2, 2, 4, 2};

        Assertions.assertArrayEquals(solution, maxCounters.solution(N, A));
    }

    @Test
    void solution2() {
        final int[] A = {3, 4, 4, 6, 1, 4, 4};
        final int N = 5;
        final int[] solution = {3, 2, 2, 4, 2};

        Assertions.assertArrayEquals(solution, maxCounters.solution2(N, A));
    }

}