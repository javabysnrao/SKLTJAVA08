package com.skillogic.keywords.statickeyword;

public class CurrencyCoverter {
	static double dollorPirce = 0.0;
     static {
    	 System.out.println("static block...");
    	 dollorPirce = 79.5;
     }
     public static void covertIntoRuppes(double dollors) {
    	 double indianRupeesAmt = dollorPirce*dollors;
    	 System.out.println("Entered Dollors : "+dollors);
    	 System.out.println("In Indian ruppes : "+indianRupeesAmt);
     }
	public static void main(String[] args) {
		System.out.println("main method....");
		CurrencyCoverter.covertIntoRuppes(45);
	}
}
