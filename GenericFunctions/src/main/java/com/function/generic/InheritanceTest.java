package com.function.generic;

class ab{
	public static void method1() {
		System.out.println("Super Method1");
	}
	
	public void method2() {
		System.out.println("Super Method2");
	}
}

class b extends ab{
	public void method3() {
		System.out.println("Base Method3");
	}
	
	public void method4() {
		System.out.println("Base Method4");
	}
	public String method4(String name) {
		String name1 = name;
		System.out.println("Base Method4");
		return name1;
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b refB = new b();
		refB.method1();
	}

}
