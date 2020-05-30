package org.jastka4.codility.countingelements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class FrogRiverOneTest {

    private final FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    void solutionExists() {
        final int X = 5;
        final int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        final int solution = 6;

        Assertions.assertEquals(solution, frogRiverOne.solution(X, A));
    }

    @Test
    void solutionDoesNotExist() {
        final int X = 5;
        final int[] A = {1, 3, 1, 4, 3, 3, 5, 4};
        final int solution = -1;

        Assertions.assertEquals(solution, frogRiverOne.solution(X, A));
    }

    @Test
    void emptyArray() {
        final int X = 5;
        final int[] A = {};
        final int solution = -1;

        Assertions.assertEquals(solution, frogRiverOne.solution(X, A));
    }

    @Test
    void maxValues() {
        final int X = 100000;
        final int[] A = new int[100000];
        final int solution = -1;

        Arrays.fill(A, 100000);

        Assertions.assertEquals(solution, frogRiverOne.solution(X, A));
    }
}