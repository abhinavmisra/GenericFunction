package com.function.generic;

import java.util.Arrays;
import java.util.Collections;

public class VerifySorting {
	
	public static boolean verifySorting(String sortOrder, String text1, String text2, String text3) throws Exception {
		text1 = text1.toLowerCase();
		text2 = text2.toLowerCase();
		text3 = text3.toLowerCase();
		String[] listActual = { text1, text2, text3 };
		int size = listActual.length;
		String[] listExpected = new String[3];
		for (int i = 0; i < size; i++) {
			listExpected[i] = listActual[i];
		}
		if (sortOrder.equalsIgnoreCase("DESC") || sortOrder.equalsIgnoreCase("DESCENDING")) {
			Arrays.sort(listExpected, Collections.reverseOrder());
		} else if (sortOrder.equalsIgnoreCase("ASC") || sortOrder.equalsIgnoreCase("ASCENDING")) {
			Arrays.sort(listExpected);
		} else {
			throw new Exception("Please specify a valid Expected Sort Order");
		}
		System.out.println("Expected " + sortOrder + " order of Values =  " + listExpected[0] + ", " + listExpected[1]
				+ ", " + listExpected[2]);
		boolean flag = Arrays.equals(listActual, listExpected);
		System.out.println("The Result of Actual Sort vs Expected " + sortOrder + " Sort ===================  " + flag);
		return flag;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		VerifySorting.verifySorting("ASC", "aGcgTajdo", "aUljBcgcS", "BIzIfuoAs");
	}

}
