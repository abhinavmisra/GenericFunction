package com.function.generic;

import java.util.ArrayList;
import java.util.List;


class test{
	
	public static int sum(int a, int b) {
		int total1 = a+b;
		return total1;
	}
	
	public static double sum(double c, double d) {
		double total1 = c+d;
		return total1;
	}
	
	//The above example is overloading
	
	static void dio() {
		System.out.println("Oops");
	}
	
	
}

public class StringArgsTest {

	public static void main(String[] dev) {
		// TODO Auto-generated method stub
		List<String> l;
		l = new ArrayList<>();
		l.add("asdas");
		System.out.println("List is "+l.get(0));
		List<String> b ;
		b = new ArrayList<>();
		b.add("ahdbf");
		l=b;
		System.out.println("List is "+b.get(0));
		System.out.println("List is l "+l.get(0));
		final int a = 10;
		dev = new String[2];
		dev[0] = "text";
		int num = dev.length;
		System.out.println("String arguments passed while running this Java Program : "+num);
		System.out.println(b);
		for(String argument : dev)
			{ 
			System.out.println(argument); 
			
			}
	}
	}
