package org.jastka4.codility.timecomplexity;

import org.jastka4.codility.TimingExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TimingExtension.class)
class FrogJmpTest {

    private final FrogJmp frogJmp = new FrogJmp();

    @Test
    void solutionStandardJumps() {
        int X = 10;
        int Y = 85;
        int D = 30;

        Assertions.assertEquals(3, frogJmp.solution(X, Y, D));
    }

    @Test
    void solution2StandardJumps() {
        int X = 10;
        int Y = 85;
        int D = 30;

        Assertions.assertEquals(3, frogJmp.solution2(X, Y, D));
    }

    @Test
    void solutionStandardJumpsSmall() {
        int X = 1;
        int Y = 5;
        int D = 2;

        Assertions.assertEquals(2, frogJmp.solution(X, Y, D));
    }

    @Test
    void solution2StandardJumpsSmall() {
        int X = 1;
        int Y = 5;
        int D = 2;

        Assertions.assertEquals(2, frogJmp.solution2(X, Y, D));
    }

    @Test
    void solutionManySmallJumps() {
        int X = 3;
        int Y = 999111321;
        int D = 7;

        Assertions.assertEquals(142730189, frogJmp.solution(3, 999111321, 7));
    }

    @Test
    void solution2ManySmallJumps() {
        int X = 3;
        int Y = 999111321;
        int D = 7;

        Assertions.assertEquals(142730189, frogJmp.solution2(3, 999111321, 7));
    }
}