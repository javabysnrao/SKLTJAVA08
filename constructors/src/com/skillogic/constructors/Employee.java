package com.skillogic.constructors;

public class Employee {
	int id;
	String name;
	double salary;
	public  Employee() {
		 System.out.println("0-param constructor");
	}
	public final void m1() {
	}
	public static void main(String[] args) {
		System.out.println("Main method started...");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
	}
}
