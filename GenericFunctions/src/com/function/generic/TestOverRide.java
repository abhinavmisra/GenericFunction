package com.function.generic;

class testOver1{
	public void method1() throws Exception, Throwable {
		System.out.println("SuperClass");
	}
}

class testOver2 extends testOver1{
	@Override
	public void method1() throws Throwable {
		super.method1();
		System.out.println("BaseClass");
	}
}

class TestOverRide {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		testOver1 ref = new testOver2();
		ref.method1();
	}

}
