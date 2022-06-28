package org.jastka4.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

/**
 * A non-empty array A consisting of N integers is given.
 * A permutation is a sequence containing each element from 1 to N once, and only once.
 * <p>
 * For example, array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * is a permutation, but array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * is not a permutation, because value 2 is missing.
 * <p>
 * The goal is to check whether array A is a permutation.
 * <p>
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
 * <p>
 * For example, given array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * the function should return 1.
 * <p>
 * Given array A such that:
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * the function should return 0.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * •	N is an integer within the range [1..100,000];
 * •	each element of array A is an integer within the range [1..1,000,000,000].
 */
public class PermCheck {

    /**
     * Complexity: O(N).
     *
     * @param A the array of integers
     * @return 1 if array A is a permutation and 0 if it is not
     */
    public int solution(int[] A) {
        final Set<Integer> seen = new HashSet<>();
        for (int number : A) {
            seen.add(number);
        }

        for (int i = 1; i <= A.length; i++) {
            if (!seen.contains(i)) {
                return 0;
            }
        }

        return 1;
    }
}
