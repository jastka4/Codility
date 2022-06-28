package org.jastka4.codility.stacksandqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StoneWallTest {

    private final StoneWall stoneWall = new StoneWall();

    @Test
    void startWithBigger() {
        int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        int solution = 7;

        Assertions.assertEquals(solution, stoneWall.solution(H));
    }

    @Test
    void startWithSmaller() {
        int[] H = {3, 4, 2, 5, 2, 4, 4, 1};
        int solution = 6;

        Assertions.assertEquals(solution, stoneWall.solution(H));
    }

    @Test
    void onlyOne() {
        int[] H = {7};
        int solution = 1;

        Assertions.assertEquals(solution, stoneWall.solution(H));
    }

    @Test
    void onlyTwoTheSame() {
        int[] H = {7, 7};
        int solution = 1;

        Assertions.assertEquals(solution, stoneWall.solution(H));
    }
}