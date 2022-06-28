package org.jastka4.codility.arrays;

/**
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 * <p>
 * Write a function:
 * class Solution { public int[] solution(int[] A, int K); }
 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
 * <p>
 * For example, given
 * A = [3, 8, 9, 7, 6]
 * K = 3
 * <p>
 * the function should return [9, 7, 6, 3, 8]. Three rotations were made:
 * [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
 * [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
 * [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 * <p>
 * For another example, given
 * A = [0, 0, 0]
 * K = 1
 * the function should return [0, 0, 0]
 * <p>
 * Given
 * A = [1, 2, 3, 4]
 * K = 4
 * the function should return [1, 2, 3, 4]
 * <p>
 * Assume that:
 * •    N and K are integers within the range [0..100];
 * •    each element of array A is an integer within the range [−1,000..1,000].
 * <p>
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
public class CyclicRotation {
    /**
     * Complexity: O(N^2).
     *
     * @param A the array to rotate
     * @param K the number of rotations
     * @return the rotated array
     */
    public int[] solution(int[] A, int K) {
        if (0 == A.length) {
            return A;
        }

        int temp;
        for (int i = 0; i < K; i++) {
            temp = A[A.length - 1];
            for (int j = A.length - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = temp;
        }
        return A;
    }

    /**
     * Complexity: O(N).
     *
     * @param A the array to rotate
     * @param K the number of rotations
     * @return the rotated array
     */
    public int[] solution2(int[] A, int K) {
        int[] solution = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int index = (i + K) % A.length;
            solution[index] = A[i];
        }

        return solution;
    }
}
