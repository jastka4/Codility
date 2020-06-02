package org.jastka4.codility.stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

/**
 * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
 * •	S is empty;
 * •	S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
 * •	S has the form "VW" where V and W are properly nested strings.
 * <p>
 * For example, the string "{[()()]}" is properly nested but "([)()]" is not.
 * <p>
 * Write a function:
 * class Solution { public int solution(String S); }
 * that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
 * <p>
 * For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]",
 * the function should return 0, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * •	N is an integer within the range [0..200,000];
 * •	string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 */
public class Brackets {

    /**
     * Complexity: O(N).
     *
     * @param S the string of characters
     * @return 1 if S is properly nested and 0 otherwise
     */
    public int solution(String S) {
        final Deque<Character> deque = new ArrayDeque<>();
        for (char ch : S.toCharArray()) {
            if ('(' == ch || '{' == ch || '[' == ch) {
                deque.push(ch);
            } else {
                if (deque.isEmpty()) {
                    return 0;
                }
                if (!isClosing(ch, deque.pop())) {
                    return 0;
                }
            }
        }

        return deque.isEmpty() ? 1 : 0;
    }

    private boolean isClosing(final char ch, final Character temp) {
        return ')' == ch && Objects.equals(temp, '(')
                || ']' == ch && Objects.equals(temp, '[')
                || '}' == ch && Objects.equals(temp, '{');
    }
}
