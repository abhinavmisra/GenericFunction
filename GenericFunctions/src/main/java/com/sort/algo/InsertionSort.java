package com.sort.algo;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i=1; i<n; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String... args) {
        InsertionSort refSort = new InsertionSort();
        int[] inputArray = {5,4,10,1,6,2};
        int[] sortedArray = refSort.sort(inputArray);
        List list = new ArrayList();
        list.add("hello");
        list.add(2);
        System.out.println(list.get(0) instanceof Object);
        System.out.println(list.get(0) instanceof Integer);


        for (int sArray : sortedArray) {
            System.out.print(sArray+" ");
        }
    }
}
