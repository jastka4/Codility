package org.jastka4.codility.iterations;

import org.jastka4.codility.TimingExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TimingExtension.class)
class BinaryGapTest {

    BinaryGap binaryGap = new BinaryGap();
    int[] positive = {1041, 32, 1376796946, 74901729, 66561, 561892, 6, 328, 1};
    int[] positiveSolutions = {5, 0, 5, 4, 9, 3, 0, 2, 0};

    int[] negative = {-200, -63276, -465, -1};
    int[] negativeSolutions = {2, 4, 3, 0};

    @Test
    @DisplayName("Solution 1 for positive numbers")
    void solutionShouldReturnsSolutionForPositive() {
        int[] array = new int[positive.length];

        for (int i = 0; i < positive.length; i++) {
            array[i] = binaryGap.solution(positive[i]);
        }

        Assertions.assertArrayEquals(positiveSolutions, array);
    }

    @Test
    @DisplayName("Solution 2 for positive numbers")
    void solution2ReturnsSolutionForPositive() {
        int[] array = new int[positive.length];

        for (int i = 0; i < positive.length; i++) {
            array[i] = binaryGap.solution2(positive[i]);
        }

        Assertions.assertArrayEquals(positiveSolutions, array);
    }

    @Test
    @DisplayName("Solution 1 for zero")
    void solutionReturnsSolutionForZero() {
        Assertions.assertEquals(0, binaryGap.solution(0));
    }

    @Test
    @DisplayName("Solution 2 for zero")
    void solution2ReturnsSolutionForZero() {
        Assertions.assertEquals(0, binaryGap.solution2(0));
    }

    @Test
    @DisplayName("Solution 1 for negative numbers")
    void solutionReturnsSolutionForNegative() {
        int[] array = new int[negative.length];

        for (int i = 0; i < negative.length; i++) {
            array[i] = binaryGap.solution(negative[i]);
        }

        Assertions.assertArrayEquals(negativeSolutions, array);
    }

    @Test
    @DisplayName("Solution 2 for negative numbers")
    void solution2ReturnsSolutionForNegative() {
        int[] array = new int[negative.length];

        for (int i = 0; i < negative.length; i++) {
            array[i] = binaryGap.solution2(negative[i]);
        }

        Assertions.assertArrayEquals(negativeSolutions, array);
    }
}