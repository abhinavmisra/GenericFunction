package com.function.generic;

public class SplitText {
	
	public static String splitString(String splitKey, String text) {
		String[] splitStringArray = text.split(splitKey);
		String a = splitStringArray[0];
		String b = splitStringArray[1];
		System.out.println("a "+a);
		System.out.println("b "+b);
		final String[] splitStringArray1 = b.split("&");
		String c = splitStringArray1[0];
		String d = splitStringArray1[1];
		System.out.println("c "+c);
		System.out.println("d "+d);
		c = c.trim();
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String te = SplitText.splitString("ID=", "https://eps-qaspfarm01.eplnet.wan/global/ctp/study/IntestLL/_Layouts/15/TMF/EditTMFLibraryDocuments.aspx?ID=64&pagetype=4\"");
		System.out.println("Final value is "+te);
	}

}
