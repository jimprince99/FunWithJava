package com.jimprince99.priorityqueue;

public class Employee {
	private int age;
	private String name;
	private int id;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(int age, String name, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", id=" + id + "]";
	}
	
	
	

}
