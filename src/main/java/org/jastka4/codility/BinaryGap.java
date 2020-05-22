package org.jastka4.codility;

/**
 * @author jastka4
 * <p>
 * Binary Gap
 * <p>
 * A binary Gap within a positive integer N is any maximal sequence of consecutive
 * zeros that is surrounded by ones at both ends in the binary representation of N.
 * For example, number 9 has a binary representation 1001 and contains a binary
 * gap of length 2. The number 529 has binary representation 1000010001
 * and contains two binary gaps: one of length 4 and one of length 3. The number
 * 20 has binary representation 1111 and has no binary gaps.
 * <p>
 * Write a function:
 * class Solution { public int solution(int N); }
 * that, given a positive integer N, returns the length of its longest
 * binary gap. The function should return 0 if N doesn’t contain a binary gap.
 * For example, given N=1041 the function should return 5, because N has binary
 * representation 10000010001 and so its longest binary gap is of length 5.
 * <p>
 * Assume that:
 * •	N is an integer within the range [1.. 2,147,483,647].
 * <p>
 */

public class BinaryGap {

    /**
     * Complexity: O(log(N)).
     *
     * @param N the positive integer
     * @return the biggest binary gap
     */
    public int solution(int N) {
        int solution = 0;
        int temp = 0;
        final String binary = Integer.toBinaryString(N);

        for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                if (temp > solution) {
                    solution = temp;
                }
                temp = 0;
            } else {
                temp++;
            }
        }

        return solution;
    }

    /**
     * Complexity: O(log(N)).
     *
     * @param N the positive integer
     * @return the biggest binary gap
     */
    public int solution2(int N) {
        int solution = 0;

        // Remove trailing zeroes and last one bit to get to first gap.
        N >>>= Integer.numberOfTrailingZeros(N) + 1;
        while (N != 0) {
            final int gapSize = Integer.numberOfTrailingZeros(N);
            if (gapSize > solution) solution = gapSize;
            N >>>= gapSize + 1;
        }

        return solution;
    }
}
