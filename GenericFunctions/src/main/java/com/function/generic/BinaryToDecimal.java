package com.function.generic;

public class BinaryToDecimal {
    //constructor
    public BinaryToDecimal(String bin) {
        int dec = Integer.parseInt(bin,2);
        System.out.println("Number in decimal is "+dec);
    }

    public static void main(String[] args) {

        BinaryToDecimal ref = new BinaryToDecimal("10101");

    }
}
