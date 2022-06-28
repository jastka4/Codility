package org.jastka4.codility.prefixsums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

class GenomicRangeQueryTest {

    private final GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

    @Test
    void oneCharacter() {
        String S = "A";
        int[] P = {0};
        int[] Q = {0};
        int[] solution = {1};

        Assertions.assertArrayEquals(solution, genomicRangeQuery.solution(S, P, Q));
    }

    @Test
    void shortString() {
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] solution = {2, 4, 1};

        Assertions.assertArrayEquals(solution, genomicRangeQuery.solution(S, P, Q));
    }

    @Test
    void longString() {
        String S = String.join("", Collections.nCopies(10000, "CAGCCTATAG"));
        int[] P = {2, 5, 0, 0, 32455};
        int[] Q = {4, 5, 6, 99999, 66866};
        int[] solution = {2, 4, 1, 1, 1};

        Assertions.assertArrayEquals(solution, genomicRangeQuery.solution(S, P, Q));
    }
}