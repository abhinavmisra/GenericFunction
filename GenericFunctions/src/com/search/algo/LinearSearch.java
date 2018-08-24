package com.search.algo;

public class LinearSearch {
	
	static int pos;
	
	public static int methodLinSearch(int arr[], int numToSearched) {
		int arrLen = arr.length;
		for(int i=0; i<arrLen; i++) {
			if(arr[i]==numToSearched) {
				pos = arr[i];
				System.out.println("Element found at position "+i);
			}
			else {
				pos = 0;
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch.methodLinSearch(new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,8}, 24);
	}

}
