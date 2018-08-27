package com.function.generic;

public class TestCompression {
	
	public static void methodCompress(String text) {
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//methodCompress("3a2b5c");
		methodCompress("a2b5c6");
	}

}
