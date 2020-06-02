package org.jastka4.codility.prefixsums;

/**
 * A DNA sequence can be represented as a string consisting of the letters A, C, G and T,
 * which correspond to the types of successive nucleotides in the sequence. Each nucleotide has
 * an impact factor, which is an integer. Nucleotides of types A, C, G and T have impact factors
 * of 1, 2, 3 and 4, respectively. You are going to answer several queries of the form:
 * What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?
 * <p>
 * The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters.
 * There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers.
 * The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained in
 * the DNA sequence between positions P[K] and Q[K] (inclusive).
 * <p>
 * For example, consider string S = CAGCCTA and arrays P, Q such that:
 * P[0] = 2    Q[0] = 4
 * P[1] = 5    Q[1] = 5
 * P[2] = 0    Q[2] = 6
 * <p>
 * The answers to these M = 3 queries are as follows:
 * •	The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice),
 *      whose impact factors are 3 and 2 respectively, so the answer is 2.
 * •	The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
 * •	The part between positions 0 and 6 (the whole string) contains all nucleotides,
 *      in particular nucleotide A whose impact factor is 1, so the answer is 1.
 * <p>
 * Write a function:
 * class Solution { public int[] solution(String S, int[] P, int[] Q); }
 * that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting of M integers,
 * returns an array consisting of M integers specifying the consecutive answers to all queries.
 * <p>
 * Result array should be returned as an array of integers.
 * <p>
 * For example, given the string S = CAGCCTA and arrays P, Q such that:
 * P[0] = 2    Q[0] = 4
 * P[1] = 5    Q[1] = 5
 * P[2] = 0    Q[2] = 6
 * the function should return the values [2, 4, 1], as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * •	N is an integer within the range [1..100,000];
 * •	M is an integer within the range [1..50,000];
 * •	each element of arrays P, Q is an integer within the range [0..N − 1];
 * •	P[K] ≤ Q[K], where 0 ≤ K < M;
 * •	string S consists only of upper-case English letters A, C, G, T.
 */
public class GenomicRangeQuery {

    /**
     * Complexity: O(N + M)
     *
     * @param S the nucleotides string (A, C, G, T)
     * @param P the start positions of the query
     * @param Q the end positions of the query
     * @return the consecutive answers to all queries
     */
    public int[] solution(String S, int[] P, int[] Q) {
        final int[][] occurrences = new int[3][S.length() + 1];
        final int[] solution = new int[P.length];

        for (int i = 0; i < S.length(); i++) {
            int a = 0;
            int c = 0;
            int g = 0;

            if ('A' == S.charAt(i)) {
                a = 1;
            } else if ('C' == S.charAt(i)) {
                c = 1;
            } else if ('G' == S.charAt(i)) {
                g = 1;
            }

            occurrences[0][i + 1] = occurrences[0][i] + a;
            occurrences[1][i + 1] = occurrences[1][i] + c;
            occurrences[2][i + 1] = occurrences[2][i] + g;
        }

        for (int i = 0; i < P.length; i++) {
            final int start = P[i];
            final int end = Q[i] + 1;

            if (occurrences[0][end] - occurrences[0][start] > 0) {
                solution[i] = 1;
            } else if (occurrences[1][end] - occurrences[1][start] > 0) {
                solution[i] = 2;
            } else if (occurrences[2][end] - occurrences[2][start] > 0) {
                solution[i] = 3;
            } else {
                solution[i] = 4;
            }
        }

        return solution;
    }
}
