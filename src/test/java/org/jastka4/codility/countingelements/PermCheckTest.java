package org.jastka4.codility.countingelements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermCheckTest {

    private final PermCheck permCheck = new PermCheck();

    @Test
    void isPermutation() {
        final int[] A = {4, 1, 3, 2};
        final int solution = 1;

        Assertions.assertEquals(solution, permCheck.solution(A));
    }

    @Test
    void missingOneElement() {
        final int[] A = {4, 1, 3};
        final int solution = 0;

        Assertions.assertEquals(solution, permCheck.solution(A));
    }

    @Test
    void allSameElements() {
        final int[] A = {4, 4, 4, 4, 4};
        final int solution = 0;

        Assertions.assertEquals(solution, permCheck.solution(A));
    }

    @Test
    void notPermutation() {
        final int[] A = {4, 2, 1, 5, 6, 2};
        final int solution = 0;

        Assertions.assertEquals(solution, permCheck.solution(A));
    }

    @Test
    void twoElementsNotPermutation() {
        final int[] A = {1, 1};
        final int solution = 0;

        Assertions.assertEquals(solution, permCheck.solution(A));
    }

    @Test
    void bigPermutation() {
        final int[] A = new int[100000];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        final int solution = 1;

        Assertions.assertEquals(solution, permCheck.solution(A));
    }
}