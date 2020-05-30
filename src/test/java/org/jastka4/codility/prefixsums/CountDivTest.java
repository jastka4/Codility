package org.jastka4.codility.prefixsums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountDivTest {

    private final CountDiv countDiv = new CountDiv();

    @Test
    void standardNumbers() {
        final int A = 6;
        final int B = 11;
        final int K = 2;
        final int solution = 3;

        Assertions.assertEquals(solution, countDiv.solution(A, B, K));
    }

    @Test
    void standardNumbers2() {
        final int A = 11;
        final int B = 345;
        final int K = 17;
        final int solution = 20;

        Assertions.assertEquals(solution, countDiv.solution(A, B, K));
    }

    @Test
    void allBigNumbers() {
        final int A = 0;
        final int B = 2000000000;
        final int K = 2000000000;
        final int solution = 2;

        Assertions.assertEquals(solution, countDiv.solution(A, B, K));
    }

    @Test
    void bigNumbersSmallDivisor() {
        final int A = 0;
        final int B = 2000000000;
        final int K = 1;
        final int solution = 2000000001;

        Assertions.assertEquals(solution, countDiv.solution(A, B, K));
    }

    @Test
    void rangeIsZero() {
        final int A = 0;
        final int B = 0;
        final int K = 11;
        final int solution = 1;

        Assertions.assertEquals(solution, countDiv.solution(A, B, K));
    }

    @Test
    void rangeIsZero2() {
        final int A = 0;
        final int B = 0;
        final int K = 1;
        final int solution = 1;

        Assertions.assertEquals(solution, countDiv.solution(A, B, K));
    }
}