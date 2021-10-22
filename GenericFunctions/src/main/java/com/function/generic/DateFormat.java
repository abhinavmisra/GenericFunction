package com.function.generic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	public static String DateFormatMethod(String format) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		String newDate = dateFormat.format(date);
		return newDate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The date in the format is "+DateFormat.DateFormatMethod("dd-MMM-YYYY"));
	}

}
