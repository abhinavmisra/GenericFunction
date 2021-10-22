package com.function.generic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse = "";
        System.out.println("A is "+A.length());
        /* Enter your code here. Print output to STDOUT. */
        for(int i=A.length()-1; i>=0; --i){
            reverse += A.charAt(i);
            System.out.println("Reverse is in lloop "+reverse);
        }
        System.out.println("Reverse is "+reverse);
        if(A.equalsIgnoreCase(reverse)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        StringBuilder text = new StringBuilder(A);
        text.reverse();
        if(A.equalsIgnoreCase(reverse)) {
        	System.out.println("Yes palindrome");
        }else {
        	System.out.println("No palindrome");
        }
	}

}
