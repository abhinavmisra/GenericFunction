package com.function.generic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome";
		int n = 3;
		String s1="";
		String s2="";
		for(int i=0; i<n; i++) {
			s1+=s.charAt(i);
		}
		System.out.println("");
		for(int i=s.length()-3; i<s.length(); i++) {
			s2+=s.charAt(i);
		}
		
		String[] arr = {s1, s2};
		Arrays.sort(arr);
		String smallest = arr[0];
		String largest = arr[1];
		
			System.out.println(smallest);
			System.out.println(largest);
			int temp = (int) Math.pow(2, 3);
			System.out.println(temp);
	}

}
