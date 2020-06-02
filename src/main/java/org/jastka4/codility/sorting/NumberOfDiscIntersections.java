package org.jastka4.codility.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array A of N non-negative integers,
 * specifying the radiuses of the discs, is given. The J-th disc is drawn with its center at (J, 0) and radius A[J].
 * <p>
 * We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have
 * at least one common point (assuming that the discs contain their borders).
 * <p>
 * The <a href="https://codility-frontend-prod.s3.amazonaws.com/media/task_static/number_of_disc_intersections/static/images/auto/0eed8918b13a735f4e396c9a87182a38.png">figure</a>
 * shows discs drawn for N = 6 and A as follows:
 * A[0] = 1
 * A[1] = 5
 * A[2] = 2
 * A[3] = 1
 * A[4] = 4
 * A[5] = 0
 * <p>
 * There are eleven (unordered) pairs of discs that intersect, namely:
 * •	discs 1 and 4 intersect, and both intersect with all the other discs;
 * •	disc 2 also intersects with discs 0 and 3.
 * <p>
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given an array A describing N discs as explained above, returns the number of (unordered)
 * pairs of intersecting discs. The function should return −1 if the number of intersecting pairs exceeds 10,000,000.
 * <p>
 * Given array A shown above, the function should return 11, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * •	N is an integer within the range [0..100,000];
 * •	each element of array A is an integer within the range [0..2,147,483,647].
 */
public class NumberOfDiscIntersections {

    /**
     * Complexity: O(N*log(N)).
     *
     * @param A the array of radiuses
     * @return the number of pairs of intersecting discs
     */
    public int solution(int[] A) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            points.add(new Point(i - (long) A[i], true));
            points.add(new Point(i + (long) A[i], false));
        }

        Collections.sort(points);

        int activeCircles = 0;
        int intersections = 0;

        for (Point point : points) {
            if (point.isStart()) {
                intersections += activeCircles;
                activeCircles++;
            } else {
                activeCircles--;
            }
            if (intersections > 10_000_000) {
                return -1;
            }
        }

        return intersections;
    }

    class Point implements Comparable<Point> {
        private long coordinates;
        private boolean start;

        public Point(final long coordinates, final boolean start) {
            this.coordinates = coordinates;
            this.start = start;
        }

        public boolean isStart() {
            return start;
        }

        @Override
        public int compareTo(Point o) {
            if (coordinates < o.coordinates) {
                return -1;
            } else if (coordinates > o.coordinates) {
                return 1;
            } else {
                if (start && !o.start) {
                    return -1;
                } else if (!start && o.start) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
