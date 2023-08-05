package com.skillogic.keywords.finalkeyword;

public final class Person {
        int id;
        String name;
        final String aadhar;
		public Person(int id, String name, String aadhar) {
			this.id = id;
			this.name = name;
			this.aadhar = aadhar;
		}
		public void displayPerson() {
			aadhar ="854848499";
			System.out.println(id+"   "+name+"   "+aadhar);
		}
		public final void displayAddress() {
			System.out.println("Person.displayAddress()");
		}
		public static void main(String[] args) {
			Person p = new Person(1, "Raj","74347378523");
			p.displayPerson();
		}
        
}
