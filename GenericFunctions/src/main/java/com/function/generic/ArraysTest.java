package com.function.generic;

import java.util.Scanner;

class veronica {
	static int x = 10;
	static int method1() {
		System.out.println("x value before reassignment "+x);
		x=20;
		System.out.println("x "+x);
		new veronica().method3();
		return x;
	}
	void method2() {
		int y = method1();
		System.out.println("y "+y);
	}
	void method3() {
		System.out.println("Method3");
		return;
	}
}

public class ArraysTest {


	public static void main(String[] args) {
		boolean resA;
		int a0=1, b0=1;
		if(a0>b0){
            resA=true;
        }if(a0<b0){
            resA=false;
        }
		// TODO Auto-generated method stub
		/*int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
		int ar2[] = new int[ar.length];
		System.out.println("Length of array is "+ar.length);
		System.out.println("Length of array is "+ar2.length);
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]);
		}
		String array = ar.toString();
        System.out.println("Arrays are "+array);
        // To print the elements in one line
        System.out.println(Arrays.toString(ar));
        veronica refVer = new veronica();
        refVer.method1();
        refVer.method2();*/
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int i=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] arr2 = new int[arr.length];
        System.out.println("Size of array2 "+arr2.length);
        for(int j=arr2.length-1; j>=0; --j){
            arr2[j]=arr[i];
            System.out.println("Value in array1 "+arr[i]);
            i++;
        }
        int sum=0;
        for(int k=0; k<arr2.length; k++ ) {
        	sum=sum +arr2[k];
        	System.out.println("Sum is "+sum);
        	System.out.print(arr2[k]);
        }
	}

}
