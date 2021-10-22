package com.function.generic;


abstract class testSuper{
	abstract public void method1();
	
	public void concreteMethod() {
		System.out.println("concreteMethod of SuperClass");
	}
}


class testBase extends testSuper{
	public void method1(){
		System.out.println("Implementation");
	}
	public void concreteMethod() {
		//super.concreteMethod();
		System.out.println("concreteMethod of BaseClass");
	}
}

class method2{
	void test3() {
		System.out.println("Inner method");
	}
	static void test1() {
		int var = 1;
		System.out.println("Variable is "+var);
	}

	private static void test2() {
		// TODO Auto-generated method stub
		
	}
}

public class TestAbstract {

	public static void main(String[] args) {
		testSuper refSuper;
		testBase refBase;
		refSuper = new testBase();
		refSuper.concreteMethod();
		method2.test1();
	}

}
