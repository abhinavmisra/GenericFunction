package com.function.generic;

public class ArrayLHSRHS {

    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 10, 15};
        int LHSSum = 0;
        int sum = 0;
        for (int i = 1; i < Array.length; i++) {
            for (int j = i + 1; j <= Array.length - 1; j++) {
                sum += Array[j];
            }
            System.out.println("Print the index " + i + " sum " + sum);
            for (int k = i - 1; k >= 0; k--) {
                LHSSum += Array[k];
            }
            System.out.println("Print the index " + i + " LHSsum " + LHSSum);
            if (LHSSum == sum) {
                System.out.println("The index where LHS is equal to RHS " + i);
                break;
            } else {
                System.out.println("No index found");
            }
            sum = 0;
            LHSSum = 0;
        }
    }
}
