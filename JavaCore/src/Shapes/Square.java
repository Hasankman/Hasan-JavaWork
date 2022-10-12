package Shapes;

public class Square extends Shape{
	int side;
	
	public Square(String colour, int side) {
		
		super (colour);
		this.side=side;
		
	}public void calculateArea() {
		System.out.println("the are of "+colour+" square is " + side*side);
	}

}
