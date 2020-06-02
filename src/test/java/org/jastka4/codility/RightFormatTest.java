package org.jastka4.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RightFormatTest {

    private RightFormat rightFormat = new RightFormat();

    @Test
    void solution() {
        String S = "BAAABAB";
        int solution = 2;

        Assertions.assertEquals(solution, rightFormat.solution(S));
    }

    @Test
    void solution2() {
        String S = "BBABAA";
        int solution = 3;

        Assertions.assertEquals(solution, rightFormat.solution(S));
    }

    @Test
    void solution3() {
        String S = "AABBBB";
        int solution = 0;

        Assertions.assertEquals(solution, rightFormat.solution(S));
    }

    @Test
    void empty() {
        String S = "";
        int solution = 0;

        Assertions.assertEquals(solution, rightFormat.solution(S));
    }

    @Test
    void isNull() {
        String S = null;
        int solution = 0;

        Assertions.assertEquals(solution, rightFormat.solution(S));
    }
}