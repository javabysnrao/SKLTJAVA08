package com.skillogic.exceptionhandling.runtime;

public class CalcuateDivision {
    public void division(int a,int b) {
    	int c = a/b;
    	System.out.println("Result "+c);
    }
	public static void main(String[] args) {
		  CalcuateDivision cd = new CalcuateDivision();
		  cd.division(10, 0);
	}
}
