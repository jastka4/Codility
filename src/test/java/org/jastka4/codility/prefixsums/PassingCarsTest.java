package org.jastka4.codility.prefixsums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PassingCarsTest {

    private final PassingCars passingCars = new PassingCars();

    @Test
    void hasSolutionStartEast() {
        int[] A = {0, 1, 0, 1, 1};
        int solution = 5;

        Assertions.assertEquals(solution, passingCars.solution(A));
    }

    @Test
    void hasSolutionStartWest() {
        int[] A = {1, 0, 1, 0, 0};
        int solution = 1;

        Assertions.assertEquals(solution, passingCars.solution(A));
    }

    @Test
    void noSolution() {
        int[] A = {1, 1, 1, 1, 1};
        int solution = 0;

        Assertions.assertEquals(solution, passingCars.solution(A));
    }
}