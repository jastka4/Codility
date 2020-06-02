package org.jastka4.codility.stacksandqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NestingTest {

    private final Nesting nesting = new Nesting();

    @Test
    void isSolution() {
        String S = "(()(())())";
        int solution = 1;

        Assertions.assertEquals(solution, nesting.solution(S));
    }

    @Test
    void noSolution() {
        String S = "())";
        int solution = 0;

        Assertions.assertEquals(solution, nesting.solution(S));
    }

    @Test
    void allOpeningBrackets() {
        String S = "(((((";
        int solution = 0;

        Assertions.assertEquals(solution, nesting.solution(S));
    }

    @Test
    void allClosingBrackets() {
        String S = ")))))";
        int solution = 0;

        Assertions.assertEquals(solution, nesting.solution(S));
    }

    @Test
    void moreClosingBrackets() {
        String S = "((())))))))";
        int solution = 0;

        Assertions.assertEquals(solution, nesting.solution(S));
    }
}