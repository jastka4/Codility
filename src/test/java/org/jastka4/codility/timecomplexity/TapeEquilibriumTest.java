package org.jastka4.codility.timecomplexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TapeEquilibriumTest {

    private final TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    void allPositiveNumbers() {
        final int[] test = {3, 1, 2, 4, 3};
        final int solution = 1;

        Assertions.assertEquals(solution, tapeEquilibrium.solution(test));
    }

    @Test
    void allNegativeNumbers() {
        final int[] test = {-3, -1, -2, -4, -3};
        final int solution = 1;

        Assertions.assertEquals(solution, tapeEquilibrium.solution(test));
    }

    @Test
    void positiveAndNegativeNumbers() {
        final int[] test = {3, 1, 2, -4, -3};
        final int solution = 5;

        Assertions.assertEquals(solution, tapeEquilibrium.solution(test));
    }

    @Test
    void emptyArray() {
        final int[] test = {};
        final int solution = 0;

        Assertions.assertEquals(solution, tapeEquilibrium.solution(test));
    }

    @Test
    void sameNumbers() {
        final int[] test = {1, 1, 1, 1, 1, 1};
        final int solution = 0;

        Assertions.assertEquals(solution, tapeEquilibrium.solution(test));
    }

    @Test
    void oneNumber() {
        final int[] test = {5};
        final int solution = 5;

        Assertions.assertEquals(solution, tapeEquilibrium.solution(test));
    }
}