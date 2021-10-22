package com.hackerrank.practice;

import java.util.HashSet;
import java.util.Set;

public class SockMerchant {
    SockMerchant(int[] arr) {
        Set<Integer> colors = new HashSet();
        int pairs = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!colors.contains(arr[i])) {
                colors.add(arr[i]);
            } else {
                pairs++;
                colors.remove(arr[i]);
            }
        }

        System.out.println(pairs);
    }

    public static void main(String[] args) {
        int[] inputArr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        new SockMerchant(inputArr);
    }
}
