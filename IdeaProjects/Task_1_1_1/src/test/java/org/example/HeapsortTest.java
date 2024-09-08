package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapsortTest {
    @Test
    public void testHeapSortWithDescendingArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        Heapsort.heapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSortWithAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        Heapsort.heapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSortWithDuplicates() {
        int[] input = {3, 3, 1, 2, 2};
        int[] expected = {1, 2, 2, 3, 3};
        Heapsort.heapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSortWithSingleElement() {
        int[] input = {1};
        int[] expected = {1};
        Heapsort.heapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        Heapsort.heapSort(input);
        assertArrayEquals(expected, input);
    }

}