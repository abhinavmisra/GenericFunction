package com.function.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		/*int temp=array[0];
		array[0] = array[9];
		array[9] = temp;
		for(int i=0; i<array.length; i++)
		System.out.println("swapped array "+array[i]);*/
		int[] array1 =  Arrays.copyOf(array, array.length+1);
		System.out.println("array size "+array1.length);
		int n = 1;
		for(int i=0; i<n; i++) {
			for (int j = array.length - 1; j > 0; j--) {
				int temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
		}
		}
		for(int i=0; i<array.length; i++)
			System.out.print(array1[i]+" ");
	}

}
