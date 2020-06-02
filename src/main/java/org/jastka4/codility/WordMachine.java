package org.jastka4.codility;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * A word machine is a system that performs a sequence of simple operations on a stack of integers.
 * Initially the stack is empty. The sequence of operations is given as a string.
 * Operations are separated by single spaces. The following operations may be specified:
 * •    an integer X (from 0 to 220 - 1): the machine pushes X onto the stack;
 * •    "POP": the machine removes the topmost number from the stack;
 * •    "DUP": the machine pushes a duplicate of the topmost number onto the stack;
 * •    "+": the machine pops the two topmost elements from the stack, adds them together and pushes the sum onto the stack;
 * •    "-": the machine pops the two topmost elements from the stack, subtracts the second one from the first (topmost) one
 *      and pushes the difference onto the stack.
 * <p>
 * After processing all the operations, the machine returns the topmost value from the stack.
 * <p>
 * The machine processes 20-bit unsigned integers (numbers from 0 to 220 - 1). An overflow in addition or underflow
 * in subtraction causes an error. The machine also reports an error when it tries to perform an operation
 * that expects more numbers on the stack than the stack actually contains. Also, if, after performing all the operations,
 * the stack is empty, the machine reports an error.
 * <p>
 * For example, given a string "13 DUP 4 POP 5 DUP + DUP + -", the machine performs the following operations:
 * operation    | comment      | stack
 * - - - - - - - - - - - - - - - - - - - - -
 * "13"         | push 13       | [empty]
 * "DUP"        | duplicate     | 13 13
 * "4"          | push 4        | 13 13 4
 * "POP"        | pop 4         | 13 13
 * "5"          | push 5        | 13 13 5
 * "DUP"        | duplicate 5   | 13, 13, 5, 5
 * "+"          | add 5 and 5   | 13, 13, 10
 * "DUP"        | duplicate 10  | 13, 13, 10, 10
 * add          | 10 and 10     | 13, 13, 20
 * subtract     | 13 from 20    | 13, 7
 * <p>
 * Finally, the machine will return 7.
 * <p>
 * Given a string "5 6 + -", the machine reports an error, since, after the addition,
 * there is only one number on the stack, but the subtraction operation expects two.
 * <p>
 * Given a string "3 DUP 5 - -", the machine reports an error, since the second subtraction yields a negative result.
 * <p>
 * Write a function:
 * public int solution(String S)
 * that, given a string S containing a sequence of operations for the word machine, returns the result the machine
 * would return after processing the Operations. The function should return -1 if the machine would report an error.
 * <p>
 * For example, given string S = "13 DUP 4 POP 5 DUP + DUP + "the function should return 7,
 * as explained in the example above. Given string S = "5 6 + -" or S = "3 DUP 5 - -" the function should return -1.
 * <p>
 * Assume that:
 * •    the length of S is within the range (0..2,000);
 * •    Sis a valid sequence of word machine operations.
 */
public class WordMachine {

    /**
     * Time complexity: O(N)
     * Space complexity: O(N + M)
     * N - number of operations
     * M - number of integers in the input string
     *
     * @param S the input string
     * @return the result of the provided operations, -1 if there was an error
     */
    public int solution(String S) {
        if (S.isEmpty()) {
            return -1;
        }

        final String[] operations = S.split(" ");
        final Deque<Integer> stack = new ArrayDeque<>(); // Deque in Java is faster in most cases than Stack

        for (String operation : operations) {
            if ("POP".equals(operation)) {
                if (stack.isEmpty()) {
                    return -1;
                }
                stack.pop();
            } else if ("DUP".equals(operation)) {
                if (stack.isEmpty()) {
                    return -1;
                }
                stack.push(stack.peek());
            } else if ("+".equals(operation)) {
                if (stack.size() < 2) {
                    return -1;
                }
                Integer int1 = stack.pop();
                Integer int2 = stack.pop();
                int result = int1 + int2;
                if (result > Math.pow(2, 20) - 1) {
                    return -1;
                }
                stack.push(result);
            } else if ("-".equals(operation)) {
                if (stack.size() < 2) {
                    return -1;
                }
                Integer int1 = stack.pop();
                Integer int2 = stack.pop();
                int result = int1 - int2;
                if (result < 0) {
                    return -1;
                }
                stack.push(result);
            } else {
                stack.push(Integer.valueOf(operation));
            }
        }

        return stack.isEmpty() ? -1 : stack.pop();
    }
}
