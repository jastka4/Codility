package org.jastka4.codility.prefixsums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinAvgTwoSliceTest {

    private final MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

    @Test
    void solution() {
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        int solution = 1;

        Assertions.assertEquals(solution, minAvgTwoSlice.solution(A));
    }
}