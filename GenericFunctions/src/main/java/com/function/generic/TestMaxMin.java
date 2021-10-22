package com.function.generic;

public class TestMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 4;
		int c = 8;
		if(a>b && a>c) {
			System.out.println("Largest number is a: "+a);
		} if(b>a && b>c) {
			System.out.println("Largest number is b: "+b);
		} if(c>a && c>b) {
			System.out.println("Largest number is c: "+c);
		} if(a<b && a<c) {
			System.out.println("Smallest number is a: "+a);
		} if(b<a && b<c) {
			System.out.println("Smallest number is b: "+b);
		} if(c<a && c<b) {
			System.out.println("Smallest number is c: "+c);
		}

	}

}
