package org.jastka4.codility.timecomplexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermMissingElemTest {

    private final PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    void middleNumberMissing() {
        int[] test = {2, 3, 1, 5};
        int solution = 4;

        Assertions.assertEquals(solution, permMissingElem.solution(test));
    }

    @Test
    void lastNumberMissing() {
        int[] test = {2, 3, 1, 4};
        int solution = 5;

        Assertions.assertEquals(solution, permMissingElem.solution(test));
    }

    @Test
    void emptyArrays() {
        int[] test = {};
        int solution = 1;

        Assertions.assertEquals(solution, permMissingElem.solution(test));
    }

    @Test
    void largeArray() {
        int n = 100000;
        int[] test = new int[n];
        int solution = 245;

        for (int i = 0, j = 1; i < n; i++) {
            if (i == 244) {
                j++;
            }
            test[i] = j++;
        }

        Assertions.assertEquals(solution, permMissingElem.solution(test));
    }
}