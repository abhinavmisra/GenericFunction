package com.function.generic;

public class ConditionTest {

    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 3;
        int count3 = 6;
        boolean hasNext = true;
        while(hasNext) {
            count1++;
            if (count1>6){
                System.out.println("Count 1 value is "+count1);
                break;
            }
            count2++;
            if (count2 > 14) {
                System.out.println("In else if condition");
                break;
            }
        }
    }
}
