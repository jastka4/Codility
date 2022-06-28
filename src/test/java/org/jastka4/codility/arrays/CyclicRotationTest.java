package org.jastka4.codility.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CyclicRotationTest {
    private CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    void solutionRotateByOne() {
        int[] test = {3, 8, 9, 7, 6};
        int[] solution = {6, 3, 8, 9, 7};
        int k = 1;

        Assertions.assertArrayEquals(solution, cyclicRotation.solution(test, k));
    }

    @Test
    void solution2RotateByOne() {
        int[] test = {3, 8, 9, 7, 6};
        int[] solution = {6, 3, 8, 9, 7};
        int k = 1;

        Assertions.assertArrayEquals(solution, cyclicRotation.solution2(test, k));
    }

    @Test
    void solutionRotateByLessThanLength() {
        int[] test = {3, 8, 9, 7, 6};
        int[] solution = {9, 7, 6, 3, 8};
        int k = 3;

        Assertions.assertArrayEquals(solution, cyclicRotation.solution(test, k));
    }

    @Test
    void solution2RotateByLessThanLength() {
        int[] test = {3, 8, 9, 7, 6};
        int[] solution = {9, 7, 6, 3, 8};
        int k = 3;

        Assertions.assertArrayEquals(solution, cyclicRotation.solution2(test, k));
    }

    @Test
    void solutionRotateByLength() {
        int[] test = {1, 2, 3, 4};
        int[] solution = {1, 2, 3, 4};
        int k = test.length;

        Assertions.assertArrayEquals(solution, cyclicRotation.solution(test, k));
    }

    @Test
    void solution2RotateByLength() {
        int[] test = {1, 2, 3, 4};
        int[] solution = {1, 2, 3, 4};
        int k = test.length;

        Assertions.assertArrayEquals(solution, cyclicRotation.solution2(test, k));
    }

    @Test
    void solutionRotateByMoreThanLength() {
        int[] test = {5, 2, 1, 9, 7};
        int[] solution = {9, 7, 5, 2, 1};
        int k = 7;

        Assertions.assertArrayEquals(solution, cyclicRotation.solution(test, k));
    }

    @Test
    void solution2RotateByMoreThanLength() {
        int[] test = {5, 2, 1, 9, 7};
        int[] solution = {9, 7, 5, 2, 1};
        int k = 7;

        Assertions.assertArrayEquals(solution, cyclicRotation.solution2(test, k));
    }

    @Test
    void solutionRotateZeroes() {
        int[] test = {0, 0, 0};
        int[] solution = {0, 0, 0};
        int k = 1;

        Assertions.assertArrayEquals(solution, cyclicRotation.solution(test, k));
    }

    @Test
    void solution2RotateZeroes() {
        int[] test = {0, 0, 0};
        int[] solution = {0, 0, 0};
        int k = 1;

        Assertions.assertArrayEquals(solution, cyclicRotation.solution2(test, k));
    }

    @Test
    void solutionEmptyArray() {
        int[] test = {};
        int[] solution = {};
        int k = 1;

        Assertions.assertArrayEquals(solution, cyclicRotation.solution(test, k));
    }

    @Test
    void solution2EmptyArray() {
        int[] test = {};
        int[] solution = {};
        int k = 1;

        Assertions.assertArrayEquals(solution, cyclicRotation.solution2(test, k));
    }
}