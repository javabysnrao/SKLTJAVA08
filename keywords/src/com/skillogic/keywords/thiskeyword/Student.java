package com.skillogic.keywords.thiskeyword;

public class Student {
    int id ;
    String name;
    String address;
    
    public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void display() {
    	System.out.println(id+"  "+name+"  "+address);
    }
	public static void main(String[] args) {
	     Student s = new Student(1,"Raj","Hyderabad");
	     s.display();
	}
}
