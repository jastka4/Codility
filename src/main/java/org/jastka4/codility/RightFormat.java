package org.jastka4.codility;

/**
 * We are given a string S of length N consisting only of letters A and/or B.
 * Our goal is to obtain a string in the format A...AB...B (all letters A occur before all letters B) by deleting
 * some letters from S. In particular, strings consisting only of letters A or only of letters B fit this format.
 * <p>
 * Write a function that, given a string S, return the minimum number of letters that need to be deleted
 * from S in order to obtain a string in the above format.
 * <p>
 * Example Example 1
 * Input: "BAAABAB"
 * Output: 2
 * Explanation: We can obtain "AAABB" by deleting the first occurrence of 'B' and the last occurrence of 'A'.
 * <p>
 * Example 2
 * Input: "BBABAA"
 * Output: 3
 * Explanation: We can delete all occurrences of 'A' or 'B'.
 * <p>
 * Example 3
 * Input: "AABBBB"
 * Output: 0
 * Explanation: We do not have to delete any letters, because the given string is already in the expected format.
 * <p>
 * These are the assumptions that might help you solve the problem:
 * •    N is an integer within the range [1,100000];
 * •    string S consists only of the characters A and/or B.
 */
public class RightFormat {

    /**
     * Time complexity: O(N)
     * Space complexity O(1)
     *
     * @param S the string of characters
     * @return the minimum number of letters that need to be deleted from S in order to obtain a string in the above format
     */
    public int solution(String S) {
        if (S.isEmpty()) {
            return 0;
        }

        int counterA = 0;
        int counterB = 0;

        for (char ch : S.toCharArray()) {
            if ('A' == ch) {
                counterA++;
            }
        }

        int solution = counterA;

        for (char ch : S.toCharArray()) {
            if ('A' == ch) {
                counterA--;
            } else {
                counterB++;
            }

            solution = Math.min(counterA + counterB, solution);
        }

        return solution;

    }


}
