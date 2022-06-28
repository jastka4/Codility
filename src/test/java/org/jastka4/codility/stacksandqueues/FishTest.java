package org.jastka4.codility.stacksandqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FishTest {

    private final Fish fish = new Fish();

    @Test
    void eatingDownstream() {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        int solution = 2;

        Assertions.assertEquals(solution, fish.solution(A, B));
    }

    @Test
    void eatingUpstream() {
        int[] A = {1, 3, 2, 5, 4, 6};
        int[] B = {0, 1, 1, 0, 0, 1};
        int solution = 4;

        Assertions.assertEquals(solution, fish.solution(A, B));
    }
}