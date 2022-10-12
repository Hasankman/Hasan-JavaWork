package Shapes;

public class Circle extends Shape {
	float radius;
	
	public Circle(String colour, float radius) {
		
		super ( colour);
		this.radius=radius;

	} public void calculateArea() {
		System.out.println("the are of "+colour+"circle is "  + 3.14 *radius *radius);
	}
}
