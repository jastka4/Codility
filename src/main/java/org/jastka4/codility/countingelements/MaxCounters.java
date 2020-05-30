package org.jastka4.codility.countingelements;

import java.util.Arrays;

/**
 * You are given N counters, initially set to 0, and you have two possible operations on them:
 * •	increase(X) − counter X is increased by 1,
 * •	max counter − all counters are set to the maximum value of any counter.
 * <p>
 * A non-empty array A of M integers is given. This array represents consecutive operations:
 * •	if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 * •	if A[K] = N + 1 then operation K is max counter.
 * <p>
 * For example, given integer N = 5 and array A such that:
 * A[0] = 3
 * A[1] = 4
 * A[2] = 4
 * A[3] = 6
 * A[4] = 1
 * A[5] = 4
 * A[6] = 4
 * the values of the counters after each consecutive operation will be:
 * (0, 0, 1, 0, 0)
 * (0, 0, 1, 1, 0)
 * (0, 0, 1, 2, 0)
 * (2, 2, 2, 2, 2)
 * (3, 2, 2, 2, 2)
 * (3, 2, 2, 3, 2)
 * (3, 2, 2, 4, 2)
 * <p>
 * The goal is to calculate the value of every counter after all operations.
 * <p>
 * Write a function:
 * class Solution { public int[] solution(int N, int[] A); }
 * that, given an integer N and a non-empty array A consisting of M integers,
 * returns a sequence of integers representing the values of the counters.
 * <p>
 * Result array should be returned as an array of integers.
 * <p>
 * For example, given:
 * A[0] = 3
 * A[1] = 4
 * A[2] = 4
 * A[3] = 6
 * A[4] = 1
 * A[5] = 4
 * A[6] = 4
 * the function should return [3, 2, 2, 4, 2], as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * •	N and M are integers within the range [1..100,000];
 * •	each element of array A is an integer within the range [1..N + 1].
 */
public class MaxCounters {

    /**
     * Complexity: O(N^2) - if N equals the length of A.
     *
     * @param N the number of counters
     * @param A the array of operations
     * @return the array representing the values of the counters
     */
    public int[] solution(int N, int[] A) {
        final int[] counters = new int[N];
        int max = 0;
        for (int value : A) {
            if (value > N) {
                Arrays.fill(counters, max);
            } else {
                int index = value - 1;
                counters[index]++;
                if (counters[index] > max) {
                    max = counters[index];
                }
            }
        }

        return counters;
    }

    /**
     * Complexity: O(N).
     *
     * @param N the number of counters
     * @param A the array of operations
     * @return the array representing the values of the counters
     */
    public int[] solution2(int N, int[] A) {
        final int[] counters = new int[N];
        int min = 0;
        int max = 0;

        for (int value : A) {
            if (value > N) {
                min = max;
            } else {
                int index = value - 1;
                if (counters[index] < min) {
                    counters[index] = min;
                }
                counters[index]++;
                if (counters[index] > max) {
                    max = counters[index];
                }
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < min) {
                counters[i] = min;
            }
        }

        return counters;
    }
}
