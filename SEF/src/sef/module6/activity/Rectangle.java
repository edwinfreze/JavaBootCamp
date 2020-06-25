package sef.module6.activity;

public class Rectangle extends Shape{
	private double length;
	private double breadth;
	private double area;
	private double perimeter;
	public Rectangle() {
		System.out.println("I'm an Rectangle Constructor");
	}
	public Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public double calculateArea(double length, double breadth) {
		this.area = this.length*this.breadth;
		// TODO Auto-generated method stub
		return area;
	}
	@Override
	public double calculatePerimeter(double length, double breadth) {
		this.perimeter=2*this.length*this.breadth;// TODO Auto-generated method stub
		return perimeter;
	}


}
