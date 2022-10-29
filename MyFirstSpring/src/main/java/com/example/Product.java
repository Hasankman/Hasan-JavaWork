package com.example;

public class Product {
	String ProductName;
	String ProductBrand;
	int ProductPrice;
	public Product(String productName, String productBrand, int productPrice) {
		super();
		this.ProductName = productName;
		this.ProductBrand = productBrand;
		this.ProductPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [ProductName=" + ProductName + ", ProductBrand=" + ProductBrand + ", ProductPrice="
				+ ProductPrice + "]";
	}
	
}
