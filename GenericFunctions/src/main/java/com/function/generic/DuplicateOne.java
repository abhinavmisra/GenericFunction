package com.function.generic;

import java.util.Arrays;

public class DuplicateOne {

    public void findDuplicate(int arr[]) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length; i++) {
            if(arr[i]==arr[i+1]) {
                System.out.println("Duplicate element in array is "+arr[i]);
               //break;
            }
        }
    }

    void printRepeating(int arr[], int size)
    {
        int i, j;
        System.out.println("Repeated Elements are :");
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String... args) {
        DuplicateOne ref = new DuplicateOne();
        int arra[] = {3,4,3,2,1};
        ref.printRepeating(arra, arra.length);
        //ref.findDuplicate(arra);
    }
}
