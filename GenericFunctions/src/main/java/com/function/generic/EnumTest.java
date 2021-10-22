package com.function.generic;

import java.util.Enumeration;
import java.util.Vector;

class EnumExample{
	enum season{
		winter, spring, autumn, summer;
	}
	private int value;
	void season(int value) {
		this.value=value;
	}
}

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumeration<String> test;
		Vector<String> refVar = new Vector<String>();
		refVar.add("Jan");
		refVar.add("Feb");
		refVar.add("Mar");
		refVar.add("Apr");
		refVar.add("May");
		refVar.add("Jun");
		refVar.add("Jul");
		refVar.add("Aug");
		refVar.add("Sep");
		refVar.add("Oct");
		refVar.add("Nov");
		refVar.add("Dec");
		
		test = refVar.elements();
		while(test.hasMoreElements()) {
			System.out.println(test.nextElement());
		}
		EnumExample refEnum = new EnumExample();
		refEnum.season(1);
	}

}
