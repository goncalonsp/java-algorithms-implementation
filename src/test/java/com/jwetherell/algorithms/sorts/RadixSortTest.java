package com.jwetherell.algorithms.sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {
    @Test
    void sortEmptyArray() {
        Integer[] input = new Integer[]{};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{}, sorted, "Empty array should return empty.");
    }

    @Test
    void sortSingleElement() {
        Integer[] input = new Integer[]{0};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{0}, sorted, "Array with one element should return the same element.");
    }

    @Test
    void sortIdenticalElements() {
        Integer[] input = new Integer[]{7, 7, 7};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{7, 7, 7}, sorted, "Array with identical elements should return identical elements.");
    }

    @Test
    void sortIncreasingOrder() {
        Integer[] input = new Integer[]{1, 2, 3, 4, 5};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sorted, "Array in increasing order should return in the same order.");
    }

    @Test
    void sortDecreasingOrder() {
        Integer[] input = new Integer[]{5, 4, 3, 2, 1};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sorted, "Array in decreasing order should return in increasing order.");
    }

    @Test
    void sortMixedNumbers() {
        Integer[] input = new Integer[]{3, 10, 2, 1, 20};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{1, 2, 3, 10, 20}, sorted, "Array with mixed numbers should be sorted in increasing order.");
    }

    @Test
    void sortNegativeNumbers() {
        Integer[] input = new Integer[]{-1, 2, -3, 4};
        assertThrows(Exception.class, () -> {
            RadixSort.sort(input);
        }, "Radix sort should throw an exception when trying to sort negative numbers.");
    }

    @Test
    void sortNullArray() {
        assertThrows(Exception.class, () -> {
            RadixSort.sort(null);
        }, "Sorting null should throw an exception.");
    }

    @Test
    void sortNonIntegerElements() {
        Integer[] input = new Integer[]{1, null, 3};  // Null here serves as a common error input.
        assertThrows(Exception.class, () -> {
            RadixSort.sort(input);
        }, "Sorting arrays containing null should throw an exception.");
    }

    // Additional test for the case you may want to add for handling of more complex invalid inputs
    @Test
    void sortInvalidTypeInput() {
        Object[] input = new Object[]{1, "two", 3.5}; // Clearly invalid for an Integer array sort.
        assertThrows(Exception.class, () -> {
            RadixSort.sort((Integer[]) input); // Requires casting to compile, hypothetical test case
        }, "Sorting an array with mixed types should throw an exception.");
    }

    @Test
    void sortMinIntegers() {
        Integer[] input = new Integer[]{1, 0};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{0, 1}, sorted, "An array with two elements should be sorted in ascending order.");
    }

    @Test
    void sortMaxIntegers() {
        Integer[] input = new Integer[]{Integer.MAX_VALUE - 1, Integer.MAX_VALUE};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{Integer.MAX_VALUE - 1, Integer.MAX_VALUE}, sorted,
                "An array with the two largest integers should be sorted in ascending order.");
    }

    @Test
    void sortSingleMaxInteger() {
        Integer[] input = new Integer[]{Integer.MAX_VALUE};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{Integer.MAX_VALUE}, sorted,
                "An array with a single element being the maximum integer should return the same element.");
    }
}

