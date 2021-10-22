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

	//By Dynamic Programming
	static int fib(int n)
	{
		/* Declare an array to store Fibonacci numbers. */
		int f[] = new int[n+2]; // 1 extra to handle case, n = 0
		int i;

		/* 0th and 1st number of the series are 0 and 1*/
		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++)
		{
       /* Add the previous 2 numbers in the series
         and store it */
			f[i] = f[i-1] + f[i-2];
		}

		return f[n];
	}

	//By recursive
	static int fibRecursive(int n)
	{
		if (n <= 1)
			return n;
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFibonacci.printFibonacci(10);
	}

}
