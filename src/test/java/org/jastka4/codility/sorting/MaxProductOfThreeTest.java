package org.jastka4.codility.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxProductOfThreeTest {

    private final MaxProductOfThree maxProductOfThree = new MaxProductOfThree();

    @Test
    void solution() {
        int[] A = {-3, 1, 2, -2, 5, 6};
        int solution = 60;

        Assertions.assertEquals(solution, maxProductOfThree.solution(A));
    }

    @Test
    void name() {
        int[] A = {-5, 5, -5, 4};
        int solution = 125;

        Assertions.assertEquals(solution, maxProductOfThree.solution(A));
    }
}