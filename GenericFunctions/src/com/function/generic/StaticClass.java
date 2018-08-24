package com.function.generic;

class TestStatic{
	public static void method1() {
		System.out.println("Method1");
	}
}

public class StaticClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic a= new TestStatic();
		a=null;
		a.method1();
	}

}
