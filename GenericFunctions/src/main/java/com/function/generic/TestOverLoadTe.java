package com.function.generic;


class OverLoaded {
	
	public void method1() {
		System.out.println("Method without parameter");
	}
	
	protected void method1(int a, int b) {
		System.out.println("Method with 2 parameters int type");
	}
	
	protected void method1(float a, float b) {
		System.out.println("Method with 2 parameters float type");
	}
	
	private void method1(int a, int b, int c) throws Throwable {
		System.out.println("Method with 3 parameters");
	}
	
	public void getmethod1(int d, int e, int f) throws Throwable {
		method1(d,e,f);
	}
	
}

public class TestOverLoadTe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoaded ref = new OverLoaded();
		ref.method1(2, 3);
		
	}

}
