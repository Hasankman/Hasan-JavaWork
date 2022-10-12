package Shapes;

public class Triangle extends Shape{
	float base;
	float hight;
	
	public Triangle(String colour, float base, float hight) {
		
		super (colour);
		this.base=base;
		this.hight=hight;
		
	}public void calculateArea() {
		System.out.println("the are of "+colour+" Triangle is " + base*hight/2);
	}

}
