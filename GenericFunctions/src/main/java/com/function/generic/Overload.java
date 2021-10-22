package com.function.generic;

import java.io.IOException;

class TestOverload{
	public int method1(int a,int b) throws IOException{
		int i = a+b;
		return i;
	}
	
	public int method1(int b, int a, double c) throws IOException{
		int i = a+b;
		return i;
	}
	
	/*protected int method1(int a,int b, int c) throws Exception {
		int i = a+b;
		return i;
	}*/
}

public class Overload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestOverload refVar = new TestOverload();
		refVar.method1(1,2, 3);
	}

}
