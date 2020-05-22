package org.jastka4.codility;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Random;

@ExtendWith(TimingExtension.class)
class MissingIntegerTest {

    private final MissingInteger missingInteger = new MissingInteger();

    @Test
    @DisplayName("Randomized positive")
    void randomizedPositive() {
        final int[] test = {1, 3, 6, 4, 1, 2};
        final int solution = missingInteger.solution(test);
        Assertions.assertEquals(5, solution);
    }

    @Test
    @DisplayName("All negative")
    void allNegative() {
        int[] test = {-1, -3};
        final int solution = missingInteger.solution(test);
        Assertions.assertEquals(1, solution);
    }

    @Test
    @DisplayName("All positive - sorted without a gap")
    void allPositiveSortedNoGap() {
        int[] test = {1, 2, 3};
        final int solution = missingInteger.solution(test);
        Assertions.assertEquals(4, solution);
    }

    @Nested
    class BigProblems {
        int[] test = new int[40000];
        int solution;

        @BeforeEach
        void init() {
            final Random r = new Random();
            final int low = 1;
            final int high = 40000;
            for (int i = 0; i < 40000; i++) {
                test[i] = r.nextInt(high - low) + low;
            }

            // TODO - read from file?
        }

        // TODO - add the actual test
        @Test
        @DisplayName("Randomized positive - 40000 elements")
        void allPositiveRandomizedBig() {
            int[] test = {1, 2, 3};
            final int solution = missingInteger.solution(test);
            Assertions.assertEquals(1, solution);
        }
    }
}