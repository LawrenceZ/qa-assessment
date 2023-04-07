package org.example.arrays;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

// leetcode 217. https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicateTest {
	// evaluate true or false if the num array contains duplicate
	int[] firstNumbs = { 1, 2, 3, 1, 1 }; // true
	int[] secondNumbs = { 1, 2, 3, 4 }; // false
	int[] thirdNumbs = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }; // true

	public boolean containsDuplicate(int[] numbs) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : numbs) {
			if (map.containsKey(num)) {
				return true;
			} else {
				map.put(num, 1);
			}
		}
		return false;
	}

	public int countDuplicateOccurrence(int[] numbs) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int counter = 0;
		for (int num : numbs) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
				// count it only once,
				// as soon as it appears the 2nd time
				if (map.get(num) == 2) {
					counter++;
				}
			} else {
				map.put(num, 1);
			}
		}
		return counter;
	}

	@Test
	public void test() {
		System.out.println(containsDuplicate(firstNumbs));
		System.out.println(countDuplicateOccurrence(firstNumbs));
		System.out.println(containsDuplicate(secondNumbs));
		System.out.println(countDuplicateOccurrence(secondNumbs));
		System.out.println(containsDuplicate(thirdNumbs));
		System.out.println(countDuplicateOccurrence(thirdNumbs));
	}
}