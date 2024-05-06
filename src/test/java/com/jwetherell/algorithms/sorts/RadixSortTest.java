package com.jwetherell.algorithms.sorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {

    @Test
    void sort() {
        Integer[] input = new Integer[]{};
        Integer[] sorted = RadixSort.sort(input);

        assertEquals(0, sorted.length);
    }
}