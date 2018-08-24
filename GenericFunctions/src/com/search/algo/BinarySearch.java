package com.search.algo;

public class BinarySearch {
	 public static int methodBinSearch(int arr[], int value) {
		 int len = arr.length;
		 int l=0;
		 int r = len-1;
		 while(l<=r) {
			 int mid = l+(r-l)/2;
			 if(arr[mid]==value) {
				 return mid;
			 }
			 if(arr[mid] < value) {
				 l = mid+1;
			 }
			 else {
				 r=mid-1;
			 }
		 }
		 return -1;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 4, 10, 40};
		System.out.println(BinarySearch.methodBinSearch(arr, 45));

	}

}
