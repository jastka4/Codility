package org.jastka4.codility.stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * A string S consisting of N characters is called properly nested if:
 * •	S is empty;
 * •	S has the form "(U)" where U is a properly nested string;
 * •	S has the form "VW" where V and W are properly nested strings.
 * <p>
 * For example, string "(()(())())" is properly nested but string "())" isn't.
 * <p>
 * Write a function:
 * class Solution { public int solution(String S); }
 * that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.
 * <p>
 * For example, given S = "(()(())())", the function should return 1 and given S = "())",
 * the function should return 0, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * •	N is an integer within the range [0..1,000,000];
 * •	string S consists only of the characters "(" and/or ")".
 */
public class Nesting {

    /**
     * Complexity: O(N).
     *
     * @param S the string of characters
     * @return 1 if string S is properly nested and 0 otherwise
     */
    public int solution(String S) {
        final Deque<Character> deque = new ArrayDeque<>();
        for (char ch : S.toCharArray()) {
            if ('(' == ch) {
                deque.push(ch);
            } else {
                if (deque.isEmpty()) {
                    return 0;
                }
                Character temp = deque.pop();
                if (temp.equals('(') && ')' != ch) {
                    return 0;
                }
            }
        }
        return deque.isEmpty() ? 1 : 0;
    }
}
