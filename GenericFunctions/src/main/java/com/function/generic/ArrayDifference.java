package com.function.generic;

import java.util.Arrays;

public class ArrayDifference {

    public void checkDiff(int[] arr, int diffNum) {
        Arrays.sort(arr);
        for(int i=arr.length-1; i>0; i--) {
            int tempDiff = arr[i]-diffNum;
            for(int j=0; j<arr.length; j++) {
                if(tempDiff==arr[j]){
                    System.out.println("The two numbers are "+arr[i]+" "+tempDiff);
                }
            }
        }
    }

    public static void main(String... args) {
        ArrayDifference ref = new ArrayDifference();
        int[] array = {3,7,12,6,4,50,6,10};
        ref.checkDiff(array, 46);
    }
}
