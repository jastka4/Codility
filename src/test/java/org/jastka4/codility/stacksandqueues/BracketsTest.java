package org.jastka4.codility.stacksandqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BracketsTest {

    private final Brackets brackets = new Brackets();

    @Test
    void isSolution() {
        String S = "{[()()]}";
        int solution = 1;

        Assertions.assertEquals(solution, brackets.solution(S));
    }

    @Test
    void noSolution() {
        String S = "([)()]";
        int solution = 0;

        Assertions.assertEquals(solution, brackets.solution(S));
    }
}