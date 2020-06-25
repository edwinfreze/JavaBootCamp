package sef.module6.activity;

public abstract class Shape {

	public String color;
	
	public Shape() {
	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double
	public abstract double calculateArea(double length, double breadth);
	public abstract double calculatePerimeter(double length, double breadth);
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	
	

}
