package com.function.generic;

public class Divisor {
	static int i;
	static int n=8;
	static int sum=0;
	public static int divisorMethod() {
		for (i = 1; i <= n; i++) {
		    if (n % i == 0) {
		        System.out.print(i + " , ");
		        sum +=i;
		    }
		}
		return sum;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int add = Divisor.divisorMethod();
		System.out.println("Sum is "+add);
	}

}
