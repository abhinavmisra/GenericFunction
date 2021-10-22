package com.function.generic;

import java.util.Arrays;

public class TestMissingNum {
	static void findMissingNumbers(int[] a, int first, int last) {
        // before the array: numbers between first and a[0]-1
	for (int i = first; i < a[0]; i++) {
		System.out.println(i);
	}
        // inside the array: at index i, a number is missing if it is between a[i-1]+1 and a[i]-1
	for (int i = 1; i < a.length; i++) {
		for (int j = 1+a[i-1]; j < a[i]; j++) {
			System.out.println(j);
		}
	}
        // after the array: numbers between a[a.length-1] and last
	for (int i = 1+a[a.length-1]; i <= last; i++) {
		System.out.println(i);
	}
}

	public static void main(String[] args) {
		int[] array = {1,1,3,5,7,8,9};
		Arrays.sort(array);
		int firstNum = array[0];
		int lastNum = array[array.length-1];
		findMissingNumbers(array,firstNum, lastNum);
		
		

		
	}

}
