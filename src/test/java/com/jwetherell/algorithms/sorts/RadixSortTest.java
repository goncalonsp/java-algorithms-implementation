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

    @Test
    void sortSingleElement() {
        Integer[] input = new Integer[]{5};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{5}, sorted, "Array com um único elemento deve permanecer inalterado.");
    }

    @Test
    void sortMultipleElementsSorted() {
        Integer[] input = new Integer[]{1, 2, 3, 4, 5};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sorted, "Array já ordenado deve permanecer inalterado.");
    }

    @Test
    void sortMultipleElementsUnsorted() {
        Integer[] input = new Integer[]{3, 1, 4, 5, 2};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sorted, "Array desordenado deve ser ordenado corretamente.");
    }

    // Este teste nao corre
    /* No Radix Sort, o método getDigit(int integer, int divisor) calcula o
    * dígito na posição atual dividindo o número pelo divisor e indo buscar o
    * resto da divisão por 10. Para números negativos, este método
    * retorna um índice negativo, que não é válido para indexar o array de buckets.*/
    @Test
    void sortNegativeElements() {
        Integer[] input = new Integer[]{-1, -3, -2, -5, -4};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{-5, -4, -3, -2, -1}, sorted, "Array com elementos negativos deve ser ordenado corretamente.");
    }

    @Test
    void sortDuplicateElements() {
        Integer[] input = new Integer[]{3, 3, 5, 1, 2, 1};
        Integer[] sorted = RadixSort.sort(input);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 5}, sorted, "Array com elementos duplicados deve ser ordenado corretamente.");
    }



}

