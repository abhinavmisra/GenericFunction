package com.function.generic;

public class IndexSortedArray {
    public int searchInsert(int[] arr, int target) {
        if(target>arr[arr.length-1]){
            return arr.length;
        }

        int l=0;
        int r=arr.length-1;
       //Binary search
        while(l<r){
            int m = l+(r-l)/2;
            if(target>arr[m]){
                l=m+1;
            }else{
                r=m;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        int[] inpArray = {1,3,5,6};
        IndexSortedArray ref = new IndexSortedArray();
        System.out.println(" Searched array is "+ ref.searchInsert(inpArray, 0));
    }
}
