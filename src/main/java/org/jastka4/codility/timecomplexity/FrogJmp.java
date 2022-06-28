package org.jastka4.codility.timecomplexity;

/**
 * A small frog wants to get to the other side of the road. The frog is currently located at position X
 * and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 * <p>
 * Write a function:
 * class Solution { public int solution(int X, int Y, int D); }
 * that, given three integers X, Y and D, returns the minimal number of jumps from position X to
 * a position equal to or greater than Y.
 * <p>
 * For example, given:
 * X = 10
 * Y = 85
 * D = 30
 * the function should return 3, because the frog will be positioned as follows:
 * •	after the first jump, at position 10 + 30 = 40
 * •	after the second jump, at position 10 + 30 + 30 = 70
 * •	after the third jump, at position 10 + 30 + 30 + 30 = 100
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * •	X, Y and D are integers within the range [1..1,000,000,000];
 * •	X ≤ Y.
 */
public class FrogJmp {

    /**
     * Complexity: O(N).
     *
     * @param X the starting position
     * @param Y the target position
     * @param D the jump distance
     * @return number of jumps to reach the target
     */
    public int solution(int X, int Y, int D) {
        int numberOfJumps = 0;
        long position = X;
        while (position < Y) {
            position += D;
            numberOfJumps++;
        }

        return numberOfJumps;
    }

    /**
     * Complexity: O(1).
     *
     * @param X the starting position
     * @param Y the target position
     * @param D the jump distance
     * @return number of jumps to reach the target
     */
    public int solution2(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y - X) / D);
    }
}
