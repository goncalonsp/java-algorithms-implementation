package com.jwetherell.algorithms.sorts;

import com.jwetherell.algorithms.sequence.LongestIncreasingSubsequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LongestIncreasingSubsequenceTest {
    @Test
    void testEmptyArray() {
        int[] input = new int[]{};
        int[] expected = new int[]{};
        assertArrayEquals(expected, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input), "Empty array should return an empty subsequence.");
    }

    @Test
    void testSingleElement() {
        int[] input = new int[]{0};
        int[] expected = new int[]{0};
        assertArrayEquals(expected, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input), "Single element array should return the same element as subsequence.");
    }

    @Test
    void testDecreasingOrder() {
        int[] input = new int[]{1, 0};
        int[] expected = new int[]{0};
        assertArrayEquals(expected, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input), "Decreasing array should return the first element as the longest subsequence.");
    }

    @Test
    void testIncreasingOrder() {
        int[] input = new int[]{0, 1};
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input), "Increasing array should return the full array as subsequence.");
    }

    @Test
    void testAllSameElements() {
        int[] input = new int[]{7, 7, 7};
        int[] expected = new int[]{7};
        assertArrayEquals(expected, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input), "Array with all same elements should return one element as subsequence.");
    }

    @Test
    void testSortedArray() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input), "Fully sorted array should return the entire array as the subsequence.");
    }

    @Test
    void testReverseSortedArray() {
        int[] input = new int[]{5, 4, 3, 2, 1};
        int[] expected = new int[]{1};
        assertArrayEquals(expected, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input), "Reverse sorted array should return the last element.");
    }

    @Test
    void testMixedArray() {
        int[] input = new int[]{3, 10, 2, 1, 20};
        int[] expected = new int[]{3, 10, 20};
        assertArrayEquals(expected, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input), "Mixed array should return the longest increasing subsequence.");
    }

    @Test
    void testNegativeNumbers() {
        int[] input = new int[]{-1, 2, -3, 4};
        int[] expected = new int[]{-1, 2, 4};
        assertArrayEquals(expected, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input), "Array with negative numbers should handle them correctly.");
    }

    @Test
    void testNullException() {
        assertThrows(NullPointerException.class, () -> LongestIncreasingSubsequence.getLongestIncreasingSubsequence(null), "Null input should throw NullPointerException.");
    }

//    @Test
//    void testInvalidInputException() {
//        assertThrows(ClassCastException.class, () -> {
//            Integer[] input = new Integer[]{1, null, 3}; // Simulation of invalid input
//            LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input); // This casting is incorrect but simulates the expected failure
//        }, "Invalid input should throw an exception.");
//    }

    @Test
    void testMinimumValueArray() {
        int[] input = new int[]{Integer.MIN_VALUE};
        int[] expected = new int[]{Integer.MIN_VALUE};
        assertArrayEquals(expected, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input), "Array with Integer.MIN_VALUE should return it as the subsequence.");
    }

    @Test
    void testMinimumMaximumValues() {
        int[] input = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE + 1};
        int[] expected = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE + 1};
        assertArrayEquals(expected, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input), "Array with increasing minimum values should return them as subsequence.");
    }

    @Test
    void testMaxIntegerValue() {
        int[] input = new int[]{Integer.MAX_VALUE};
        int[] expected = new int[]{Integer.MAX_VALUE};
        assertArrayEquals(expected, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input), "Array with Integer.MAX_VALUE should return it as the subsequence.");
    }

    // testes data flow

    @Test
    void testDataFlow1(){
        int[] input = new int[]{0,1,2};
        int[] expected = new int[]{0,1,2};
    }

    @Test
    void testDataFlow2(){
        int[] input = new int[]{2,1,0};
        int[] expected = new int[]{0};
    }
}

