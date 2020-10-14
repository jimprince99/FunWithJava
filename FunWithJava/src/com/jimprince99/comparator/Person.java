package com.jimprince99.comparator;

public class Person implements Comparable<Person> {
	String firstName;
	String lastName;
	int age;
	int id;
	
	public Person(String firstName, String lastName, int age, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Person o) {
		String myName = this.getFirstName() + " " + this.getLastName();
		String oName = o.getFirstName() + " " + o.getLastName();
				
		return myName.compareToIgnoreCase(oName);
	}


	

}
