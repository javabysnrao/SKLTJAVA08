package com.skillogic.keywords.statickeyword;

public class Employee {
    int id;
    String name;
    static String company="TCS";
    public Employee(int eid,String ename) {
    	id = eid;
    	name = ename;
    }
    public void displayEmployee() {
    	System.out.println(id+"  "+name+"  "+company);
    }
	public static void main(String[] args) {
		System.out.println("Employee.main()");
		Employee e1 = new Employee(1, "Raj");
		Employee e2 = new Employee(2, "Kiran");
		Employee e3 = new Employee(3, "Mahesh");
		e1.displayEmployee();
		e2.displayEmployee();
		e3.displayEmployee();
	}
}
