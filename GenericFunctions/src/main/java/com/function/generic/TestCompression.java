package com.function.generic;

public class TestCompression {
	
	/*public static void methodCompress(String text) {
		int textLength = text.length();
		for(int i=0; i<textLength-1; i++) {
			if(Character.isDigit(text.charAt(i))) {
				int j = Character.getNumericValue(text.charAt(i));
				for(int k=0; k<j; k++) {
					System.out.print(text.charAt(i+1));
				}
				++i;
			}
			else {
				int l = Character.getNumericValue(text.charAt(i+1));
				for(int m=0; m<l; m++) {
					System.out.println(text.charAt(i));
					++i;
				}
			}
			
		}
	}*/
	
	//immutable
	public static String methodString(String text) {
			String text1=text+"def";
			System.out.println("value of text in method "+text1);
			return text;
	}
	
	//mutable // non-synchronized
	public static void methodStringBuil(StringBuilder text) {
		text.append("def");
	}
	
	//mutable // synchronized
	public static void methodStringBuffer(StringBuffer text) {
		text.append("def");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//methodCompress("3a2b5c");
		String text = "abc";
		methodString(text);
		System.out.println("Value of text in string "+text);
		
		String textBuilder = "abc";
		StringBuilder refBuilder = new StringBuilder(textBuilder);
		methodStringBuil(refBuilder);
		System.out.println("Value of text in stringbuilder "+refBuilder);
		
		String textBuffer = "abc";
		StringBuffer refBuffer = new StringBuffer(textBuffer);
		methodStringBuffer(refBuffer);
		System.out.println("Value of text in stringbuffer "+refBuffer);
	}

}
