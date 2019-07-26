package com.function.generic;

class testOver1{
	public void method1() throws Exception, Throwable {
		System.out.println("SuperClass");
	}
	public static void met2() {
		System.out.println("static method in super class");
	}
}

class testOver2 extends testOver1{
	@Override
	public void method1() throws Throwable {
		super.method1();
		System.out.println("BaseClass");
	}
	public static void met2() {
		System.out.println("static method in super class");
	}
}

class TestOverRide {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		testOver1 ref = new testOver2();
		ref.method1();
		//Runtime polymorphism doesn't happen with static class
		//ref.met2();
	}

}
