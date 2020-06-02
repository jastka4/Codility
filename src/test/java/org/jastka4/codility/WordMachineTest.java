package org.jastka4.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordMachineTest {

    private WordMachine wordMachine = new WordMachine();

    @Test
    void solution() {
        String S = "13 DUP 4 POP 5 DUP + DUP + -";

        Assertions.assertEquals(7, wordMachine.solution(S));
    }

    @Test
    void error1() {
        String S = "5 6 + -";

        Assertions.assertEquals(-1, wordMachine.solution(S));
    }

    @Test
    void error2() {
        String S = "3 DUP 5 - -";

        Assertions.assertEquals(-1, wordMachine.solution(S));
    }

    @Test
    void emptyString() {
        String S = "";

        Assertions.assertEquals(-1, wordMachine.solution(S));
    }

//    @Test
//    void stackOverflow() {
//        String S = String.join(" ", Collections.nCopies(1048576, "5"));
//
//        Assertions.assertEquals(-1, test2.solution(S));
//    }

    @Test
    void integerOverflow() {
        String S = "1048575 2 +";

        Assertions.assertEquals(-1, wordMachine.solution(S));
    }

    @Test
    void noIntegerOverflow() {
        String S = "1048575 0 +";

        Assertions.assertEquals(1048575, wordMachine.solution(S));
    }

    @Test
    void dupStart() {
        String S = "DUP 3 5 +";

        Assertions.assertEquals(-1, wordMachine.solution(S));
    }

    @Test
    void subtractStart() {
        String S = "- 3 5 +";

        Assertions.assertEquals(-1, wordMachine.solution(S));
    }

    @Test
    void additionStart() {
        String S = "3 + 5 +";

        Assertions.assertEquals(-1, wordMachine.solution(S));
    }
}