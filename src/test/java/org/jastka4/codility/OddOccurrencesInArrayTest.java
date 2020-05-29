package org.jastka4.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddOccurrencesInArrayTest {

    private final OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    void solutionOneOddOccurrence() {
        final int[] test = {9, 3, 9, 3, 9, 7, 9};
        final int solution = 7;

        Assertions.assertEquals(solution, oddOccurrencesInArray.solution(test));
    }

    @Test
    void solution2OneOddOccurrence() {
        final int[] test = {9, 3, 9, 3, 9, 7, 9};
        final int solution = 7;

        Assertions.assertEquals(solution, oddOccurrencesInArray.solution2(test));
    }

    @Test
    void solutionNoOddOccurrence() {
        final int[] test = {3, 5, 1, 3, 5, 1, 8, 8};
        final int solution = 0;

        Assertions.assertEquals(solution, oddOccurrencesInArray.solution(test));
    }

    @Test
    void solution2NoOddOccurrence() {
        final int[] test = {3, 5, 1, 3, 5, 1, 8, 8};
        final int solution = 0;

        Assertions.assertEquals(solution, oddOccurrencesInArray.solution2(test));
    }

    @Test
    void solutionEmptyArray() {
        final int[] test = {};
        final int solution = 0;

        Assertions.assertEquals(solution, oddOccurrencesInArray.solution(test));
    }

    @Test
    void solution2EmptyArray() {
        final int[] test = {};
        final int solution = 0;

        Assertions.assertEquals(solution, oddOccurrencesInArray.solution2(test));
    }
}