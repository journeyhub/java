package com.java.array;

import java.util.HashMap;
import java.util.Map;

public class SortIntegerArray {

	/**
	 * Given an array A[ ] consisting of only 0s, 1s, and 2s. The task is to write a
	 * function that sorts the given array. The functions should put all Os first,
	 * then all 1s and all 2s in last.
	 * 
	 * Examples
	 * 
	 * Input [0, 1, 2, 0, 1, 2] Output: [0, 0, 1, 1, 2, 2]
	 * 
	 * Input: [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1] Output: [0, 0, 0, 0, 0, 1, 1, 1,
	 * 1, 1, 2, 2]
	 *
	 */

	public int[] sortArray(int[] arr) {

		int low = 0, mid = 0, high = arr.length - 1;

		while (mid <= high) {
			switch (arr[mid]) {
			case 0:
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				int temp2 = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp2;
				high --;
				break;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		SortIntegerArray object = new SortIntegerArray();
		int[] inputArray = { 0, 1, 2, 0, 1, 2 };
		int[] outputArray = object.sortArray(inputArray);
		for (int element : outputArray) {
			System.out.print(element + " ");
		}
	}
	
	
}

