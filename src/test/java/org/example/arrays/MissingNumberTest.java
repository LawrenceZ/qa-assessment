package org.example.arrays;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

// leetcode 268 https://leetcode.com/problems/missing-number/
/**
 * based on the length of int array
 * find the missing number, starting from 0
 * e.g. [1, 2, 3] missing 0
 * As [1, 2, 3] is the range of [0, 3], so missing 0 in [1, 2, 3]
 */

public class MissingNumberTest {
    int[] firstNums = { 1, 2, 3 };
    int[] secondNums = { 0, 1 };
    int[] thirdNums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
    int[] fourthNums = { 9, 8, 4, 2, 3, 5, 6, 0, 1 };

    public int findMissingNumber(int[] numbers) {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i) {
                return i;
            }
        }
        return numbers.length;
    }

    @Test
    public void test() {
        System.out.println(findMissingNumber(firstNums));
        System.out.println(findMissingNumber(secondNums));
        System.out.println(findMissingNumber(thirdNums));
        System.out.println(findMissingNumber(fourthNums));
    }
}