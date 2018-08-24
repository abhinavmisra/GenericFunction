package com.function.generic;


class OurException extends Exception{
	
	public OurException(String s) {
		super(s);
	}
	
	public static void getMessageDetails() {
		System.out.println("Exception details");
	}
	
}

public class TestUserDefinedExce {

	public int sub(int a, int b) {
		int c = a-b;
		return c;
	}
	public static void main(String[] args) throws OurException {
		// TODO Auto-generated method stub
		TestUserDefinedExce refVaria = new TestUserDefinedExce();
		int d = refVaria.sub(10,20);
		if(d<0) {
				throw new OurException("Exception");
		}
		System.out.println("The difference is "+d);

	}

}
