package org.jastka4.codility.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private final Triangle triangle = new Triangle();

    @Test
    void isSolution() {
        int[] A = {10,2,5,1,8,20};
        int solution = 1;

        Assertions.assertEquals(solution, triangle.solution(A));
    }

    @Test
    void integerOverflow() {
        int[] A = {2_147_483_645, 2_147_483_647, 7};
        int solution = 1;

        Assertions.assertEquals(solution, triangle.solution(A));
    }

    @Test
    void noSolution() {
        int[] A = {10,50, 5, 1};
        int solution = 0;

        Assertions.assertEquals(solution, triangle.solution(A));
    }
}