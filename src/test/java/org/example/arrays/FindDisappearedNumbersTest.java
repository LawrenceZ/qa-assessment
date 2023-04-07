package org.example.arrays;

import org.junit.jupiter.api.Test;

import java.util.*;

//leetcode 448 https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

/**
 * for the range of [1, n]
 */
public class FindDisappearedNumbersTest {

	int[] firstNumbers = { 4, 3, 2, 7, 8, 2, 3, 1 }; // return [5,6]
	int[] secondNumbers = { 1, 1 }; // return [2]
	List<Integer> thirdListNumbers = Arrays.asList(1, 3, 4);

	public List<Integer> findDisappearedNumbers(int[] numbers) {
		// first use set to filter out duplicates
		Set<Integer> set = new HashSet<>();
		for (int num : numbers) {
			set.add(num);
		}
		// then loop through the length to find the missing numbers
		// the loop starts at 1 since the range is [1, n]
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i <= numbers.length; i++) {
			if (!set.contains(i)) {
				result.add(i);
			}
		}
		return result;
	}

	@Test
	public void test() {
		System.out.println("findDisappearedNumbers: " + findDisappearedNumbers(firstNumbers));
		System.out.println("findDisappearedNumbers: " + findDisappearedNumbers(secondNumbers));
		System.out.println("findDisappearedNumbers: " +
				findDisappearedNumbers(thirdListNumbers.stream().mapToInt(Integer::intValue).toArray()));
	}
}