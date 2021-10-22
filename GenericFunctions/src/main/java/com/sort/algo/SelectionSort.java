package com.sort.algo;

// Fnd the Minimum element from an array and put it at the beginning
public class SelectionSort {
    public int[] sort(int[] arr) {
        int len = arr.length;

        for(int i=0; i<len-1; i++) {
            //Assume first value in an array as minimum
            int min_pos = i;
            for (int j=i+1; j<len; j++) {
                if (arr[j] < arr[min_pos]) {
                    min_pos = j;
                }
            }
            int temp = arr[min_pos];
            arr[min_pos] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort ref = new SelectionSort();
        int[] inputArray = {7,4,10,8,3,1};
        int[] sortedArray = ref.sort(inputArray);

        for(int i=0; i<sortedArray.length; i++) {
            System.out.println("Sorted Array is "+sortedArray[i]);

        }
    }
}
