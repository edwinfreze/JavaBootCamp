package sef.module6.activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_I {
	
	//Attributes
	private int salary;
	private String title;
	
	public Employee_I(){
		
		System.out.println("I'm Employee_I constructor"); 
	}
	
	//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'4
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	// setter for String school
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	// write getter for int salary
	
	
	// write setter for int salary
	
	
	// write getter for String title
	
	
	// write setter for String title
	
}
