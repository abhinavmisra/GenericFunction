package com.function.generic;

import java.util.ArrayList;
import java.util.List;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		try {
			++i;
			throw new Exception("Exception occurs");
		}catch(Exception e) {
			++i;
		}finally {
			System.out.println("The value of i is "+ i++);
			System.out.println("The value of i after post increment is is "+i);
		}
		
		System.out.println("Method class");
		final List<String> list;
		list = new ArrayList<>();
		
		List<String> b;
	}

}
