package org.jastka4.codility.sorting;

import java.util.Arrays;

/**
 * An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
 * •	A[P] + A[Q] > A[R],
 * •	A[Q] + A[R] > A[P],
 * •	A[R] + A[P] > A[Q].
 * <p>
 * For example, consider array A such that:
 * A[0] = 10    A[1] = 2    A[2] = 5
 * A[3] = 1     A[4] = 8    A[5] = 20
 * <p>
 * Triplet (0, 2, 4) is triangular.
 * <p>
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given an array A consisting of N integers, returns 1 if there exists
 * a triangular triplet for this array and returns 0 otherwise.
 * <p>
 * For example, given array A such that:
 * A[0] = 10    A[1] = 2    A[2] = 5
 * A[3] = 1     A[4] = 8    A[5] = 20
 * the function should return 1, as explained above. Given array A such that:
 * A[0] = 10    A[1] = 50    A[2] = 5
 * A[3] = 1
 * the function should return 0.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * •	N is an integer within the range [0..100,000];
 * •	each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 */
public class Triangle {

    /**
     * Complexity: O(N*log(N)).
     *
     * @param A the array of integers
     * @return 1 if there exists a triangular triplet for this array and returns 0 otherwise
     */
    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            if ((long) A[i] + A[i + 1] > A[i + 2]) {
                return 1;
            }
        }

        return 0;
    }
}
