package org.jastka4.codility.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a function
 * class Solution { public int solution(int[] A); }
 * that, given an array A consisting of N integers, returns the number of distinct values in array A.
 * <p>
 * For example, given array A consisting of six elements such that:
 * A[0] = 2    A[1] = 1    A[2] = 1
 * A[3] = 2    A[4] = 3    A[5] = 1
 * the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * •	N is an integer within the range [0..100,000];
 * •	each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class Distinct {

    /**
     * Complexity: O(N).
     *
     * @param A the array of numbers
     * @return the number of distinct values in array A
     */
    public int solution(int[] A) {
        final Set<Integer> distinct = new HashSet<>();
        for (int number : A) {
            distinct.add(number);
        }

        return distinct.size();
    }

    /**
     * Complexity: O(N*log(N)).
     *
     * @param A
     * @return
     */
    public int solution2(int[] A) {
        if (0 == A.length) {
            return 0;
        }

        Arrays.sort(A);

        int distinct = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                distinct++;
            }
        }

        return distinct;
    }
}
