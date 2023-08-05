package com.skillogic.keywords.statickeyword;

import java.util.Date;
public class DisplayDate {
	public static void displayCurrentDate() {
		Date d = new Date();
		System.out.println("Today Date: "+d);
	}
	public static void main(String[] args) {
		DisplayDate.displayCurrentDate();
	}
}
