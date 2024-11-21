package com.ShoppersStack_GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class java_Utility {
	public int generateRandomNumber() {
		Random r=new Random();
		int num=r.nextInt(1000);
		return num;
		
	}
	public String localDate() {
		String value = LocalDate.now().toString().replace("_"," ");
		return value;
	}
	public String dateAndTime() {
		String time = LocalDateTime.now().toString().replace("_"," ").replace(":"," ").replace(".","" );
		return time;
	}
}
