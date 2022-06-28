package org.jastka4.codility.prefixsums;

/**
 * A non-empty array A consisting of N integers is given. The consecutive elements of array A represent consecutive cars on a road.
 * <p>
 * Array A contains only 0s and/or 1s:
 * •	0 represents a car traveling east,
 * •	1 represents a car traveling west.
 * <p>
 * The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N,
 * is passing when P is traveling to the east and Q is traveling to the west.
 * <p>
 * For example, consider array A such that:
 * A[0] = 0
 * A[1] = 1
 * A[2] = 0
 * A[3] = 1
 * A[4] = 1
 * We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).
 * <p>
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty array A of N integers, returns the number of pairs of passing cars.
 * <p>
 * The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.
 * <p>
 * For example, given:
 * A[0] = 0
 * A[1] = 1
 * A[2] = 0
 * A[3] = 1
 * A[4] = 1
 * the function should return 5, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * •	N is an integer within the range [1..100,000];
 * •	each element of array A is an integer that can have one of the following values: 0, 1.
 */
public class PassingCars {

    /**
     * Complexity: O(N).
     *
     * @param A the array of cars
     * @return the number of pairs of passing cars
     */
    public int solution(int[] A) {
        int east = 0;
        int passes = 0;

        for (int car : A) {
            if (0 == car) {
                east++;
            } else {
                passes += east;
                if (passes > 1_000_000_000) {
                    return -1;
                }
            }
        }

        return passes;
    }
}
