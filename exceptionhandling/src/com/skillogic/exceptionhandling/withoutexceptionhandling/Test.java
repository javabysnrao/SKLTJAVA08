package com.skillogic.exceptionhandling.withoutexceptionhandling;

public class Test {
	public void calcuteDiv(int a, int b) {
		System.out.println("Start calcuteDiv()");
		int c = 0;
		try {
			c = a / b;
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("Result :" + c);
		System.out.println("Some imprt code");
		System.out.println("End of calcuteDiv");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		Test t = new Test();
		t.calcuteDiv(10, 0);
		System.out.println("End of main method");
	}
}
