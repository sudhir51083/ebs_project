package com.capgemini.ebs.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class EBSUtility {
	/*
	public static Timestamp getTodaysDate() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		Date timeStamp = null;
		try {
			timeStamp = format.parse(simpleDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Timestamp) timeStamp;
	}
	public static String getConsumerNumber() {
		return new SimpleDateFormat("yyMMddmmssss").format(new Date());
	}*/
	public static Date getTodaysDate() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		Date timeStamp = null;
		try {
			timeStamp = format.parse(simpleDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//java.sql.Timestamp ts = java.sql.Timestamp.valueOf( rightNow.toString());
		System.out.println(timeStamp);
		return timeStamp;
	}
	public static String getTodaysStringDate() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		Date timeStamp = null;
		try {
			timeStamp = format.parse(simpleDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//java.sql.Timestamp ts = java.sql.Timestamp.valueOf( rightNow.toString());
		System.out.println(timeStamp);
		return simpleDate;
	}
	public static String getConsumerNumber() {
		return new SimpleDateFormat("yyMMddmmssss").format(new Date());
	}
	
	public static String getFormattedDate(String oDate) {
		//DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat outputFormat = new SimpleDateFormat("MM/yyyy", Locale.US);
		DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.US);

		String inputText = "2012-11-17T00:00:00.000-05:00";
		Date date=null;
		try {
			date = inputFormat.parse(inputText);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String outputText = outputFormat.format(date);
		return outputText;
		//DateFormat targetFormat = new SimpleDateFormat("dd MMM yyyy");
		//return targetFormat.format(oDate);
		/*
		Date formattedDate = null;
		try {
			Date date=originalFormat.parse(oDate.toString());
			formattedDate = targetFormat.parse(date.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("formattedDate : "+formattedDate);
		return formattedDate;
		*/
	}
}
