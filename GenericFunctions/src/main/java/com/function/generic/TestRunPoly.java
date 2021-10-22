package com.function.generic;


class SupA {
	
	public void method1() {
		System.out.println("Method 1 of super class");
	}
}

class BaseA extends SupA {
	@Override
	public void method1() {
		System.out.println("Method 1 of sub class");
	}
}

public class TestRunPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupA ref = new BaseA();
		ref.method1();

	}

}
