package com.sparta.lmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

public class SortingTests {
    @Test
    @DisplayName("Tests an int array {56, 2, 31, 8} is sorted in ascending order via bubble sort ")
    void testBubbleSort(){
        Assertions.assertEquals(Arrays.toString(new int[]{2, 8, 31, 56}), Arrays.toString(Bubble.bubbleSort(new int[]{56, 2, 31, 8})));
    }
}
