package com.function.generic;

public class TestFibonacci {

	public static void printFibonacci(int num) {
		int num1 = 0; 
		int num2 = 1;
		for(int i=0; i<=num; ++i) {
				System.out.print(num1+" , ");
				int j=num1+num2;
				num1=num2;
				num2=j;
				
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFibonacci.printFibonacci(10);
	}

}
