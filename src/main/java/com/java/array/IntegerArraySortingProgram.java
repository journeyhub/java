package com.java.array;

/**
 * Given an array consisting of only 0s, 1s, and 2s. The task is to write a
 * function that sorts the given array. The functions should put all Os first,
 * then all 1s and all 2s in last.
 * 
 * Examples
 * 
 * Input [0, 1, 2, 0, 1, 2] Output: [0, 0, 1, 1, 2, 2]
 * 
 * Input: [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1] 
 * Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
 *
 */
public class IntegerArraySortingProgram {
	// Method to sort an array of 0s, 1s, and 2s using input array
	// algorithm
	public static void sort012(int[] arr) {
		// Pointers for 0s, 1s, and 2s
		int low = 0, high = arr.length - 1, mid = 0;
		// [0, 1, 1, 2, 1, 2]
		// []
		// l = 1      m = 2        h = 5
		// Continue until mid pointer reaches the end of the array
		while (mid <= high) {
			// Check the value at the current position
			switch (arr[mid]) {
			// If 0, swap with the element at the low pointer, increment both low and mid
			case 0:
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			// If 1, just increment the mid pointer
			case 1:
				mid++;
				break;
			// If 2, swap with the element at the high pointer, decrement high
			case 2:
				int temp2 = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp2;
				high--;
				break;
			}
		}
	}

	// Main method
	public static void main(String[] args) {

		// Example array 1
		int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		// Sort the array using the sort012 method
		sort012(arr);
		// Print the sorted array
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	
}
