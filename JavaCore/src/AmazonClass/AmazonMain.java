package AmazonClass;

import java.util.Scanner;

public class AmazonMain {
	public static void main(String[] args) {
	 
		Customer Customer1=new Customer();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Names");
		Customer1.Names=scn.nextLine();
		System.out.println("Enter Email");
		Customer1.Email=scn.nextLine();
		System.out.println("Enter Adress");
		Customer1.Adress=scn.nextLine();
		System.out.println("Enter Phone");
		Customer1.Phone=scn.nextFloat();
	 
		Product Product1=new Product();
		Scanner scn1=new Scanner(System.in);
		System.out.println("Enter Type of product");
		Product1.Type=scn1.nextLine();
		System.out.println("Enter Material");
		Product1.Material=scn1.nextLine();
		System.out.println("Enter Colour");
		Product1.Colour=scn1.nextLine();
		System.out.println("Enter Price");
		Product1.Price=scn1.nextFloat();
}
}
