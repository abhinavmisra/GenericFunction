package com.function.generic;

public class ArrayRotationNumber {
    public void findRoatation(int[] sortArray, int[] inputArray) {
        int inputArrayLen = inputArray.length;
        int lastEleInArray = inputArray[inputArrayLen-1];
        for(int i=0; i<sortArray.length; i++) {
            if(lastEleInArray == sortArray[i]){
                int arrayRotation = i+1;
                System.out.println("Number of times array rotated "+arrayRotation);
            }
        }
    }

    public static void main(String[] args) {
        ArrayRotationNumber ref = new ArrayRotationNumber();
        int[] sortedArray = {-2, -1, 3, 5, 6, 8, 9, 10};
        int[] inputArray = {8, 9, 10, -2, -1, 3, 5, 6};
        ref.findRoatation(sortedArray, inputArray);
    }
}
