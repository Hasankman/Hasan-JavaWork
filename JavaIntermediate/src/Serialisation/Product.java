package Serialisation;

import java.io.Serializable;//special interface without any method
//Interface without any method is called marker interface
//this makes object capable of converting into streams of bytes


public class Product implements Serializable {
	public int prodId;
	public String name;
	public transient int price;
	public String brand;
	public Product(int prodId, String name, int price, String brand) {
		super();
		this.prodId = prodId;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
}
