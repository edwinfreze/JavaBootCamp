package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5,6);
		r.setColor("Blue");
		
		System.out.println("Color of the rectangle is: "+r.getColor());
		System.out.println("Area of the rectangle is: "+r.calculateArea(5, 6));
		System.out.println("Perimeter of the rectangle is: "+r.calculatePerimeter(5, 6));
		// TODO Auto-generated method stub

	}

}
