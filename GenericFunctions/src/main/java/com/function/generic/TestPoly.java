package com.function.generic;


class c1 {
	 protected void m1() throws Exception{
		System.out.println("m1 method");
	}
}


class c2 extends c1 {
	@Override
	public void m1() {
		System.out.println("m1 method overriding");

	}
}


public class TestPoly {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Runtime Polymorphism
		
		c1 ref = new c2();
		ref.m1();
	}

}
