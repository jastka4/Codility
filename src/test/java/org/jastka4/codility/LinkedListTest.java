package org.jastka4.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListTest {

    private LinkedList linkedList = new LinkedList();

    @Test
    void solution() {
        int[] A = {1, 4, -1, 3, 2};

        Assertions.assertEquals(4, linkedList.solution(A));
    }

    @Test
    void onlyOneElement() {
        int[] A = {-1};

        Assertions.assertEquals(0, linkedList.solution(A));
    }

    @Test
    void withDuplicates() {
        int[] A = {1, 4, 2, -1, 3, 2, 4};

        Assertions.assertEquals(4, linkedList.solution(A));
    }

    @Test
    void cycle() {
        int[] A = {1, 3, -1, 0, 2};

        Assertions.assertEquals(-1, linkedList.solution(A));
    }
}