package org.jastka4.codility;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A non-empty array A consisting of N integers is given. The array contains an odd number of elements,
 * and each element of the array can be paired with another element that has the same value,
 * except for one element that is left unpaired.
 * <p>
 * For example, in array A such that:
 * A[0] = 9  A[1] = 3  A[2] = 9
 * A[3] = 3  A[4] = 9  A[5] = 7
 * A[6] = 9
 * <p>
 * the elements at indexes 0 and 2 have value 9,
 * the elements at indexes 1 and 3 have value 3,
 * the elements at indexes 4 and 6 have value 9,
 * the element at index 5 has value 7 and is unpaired.
 * <p>
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given an array A consisting of N integers fulfilling the above conditions,
 * returns the value of the unpaired element.
 * <p>
 * For example, given array A such that:
 * A[0] = 9  A[1] = 3  A[2] = 9
 * A[3] = 3  A[4] = 9  A[5] = 7
 * A[6] = 9
 * the function should return 7, as explained in the example above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * •	N is an odd integer within the range [1..1,000,000];
 * •	each element of array A is an integer within the range [1..1,000,000,000];
 * •	all but one of the values in A occur an even number of times.
 */
public class OddOccurrencesInArray {

    /**
     * Complexity: O(N*log(N)).
     *
     * @param A the array
     * @return the value of the unpaired element
     */
    public int solution(int[] A) {
        final Map<Integer, Boolean> occurrences = new HashMap<>();
        final Set<Integer> testingArray = new HashSet<>();

        for (int number : A) {
            occurrences.put(number, testingArray.add(number));
        }

        for (Map.Entry<Integer, Boolean> entry : occurrences.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }

        return 0;
    }

    /**
     * Complexity: O(N).
     *
     * @param A the array
     * @return the value of the unpaired element
     */
    public int solution2(int[] A) {
        int oddNumber = 0;

        for (int number : A) {
            oddNumber ^= number;
        }

        return oddNumber;
    }
}
