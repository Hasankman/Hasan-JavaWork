package Shapes;

public class ShapesMain {

	public static void main(String[] args) {
		Circle c=new Circle("red", 5);
		Square s=new Square("pink", 7);
		Triangle t=new Triangle("yellow", 10,7);
		s.calculateArea();
		c.calculateArea();
		t.calculateArea();
		

	}

}
