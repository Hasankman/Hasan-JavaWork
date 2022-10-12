package ClassObject;

import java.util.Scanner;

public class Bookclass {
	public static void main(String[] args) {
		
		Book book1=new Book();
		book1.Title="Tell me your dreams";
		book1.Author="Sidney Sheldon";
		book1.Price=13.99F;
		book1.Publisher="XYZ publisher";
		
		Book Book2=new Book();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Title");
		Book2.Title=scn.nextLine();
		System.out.println("Enter Author");
		Book2.Author=scn.nextLine();
		System.out.println("Enter Publisher");
		Book2.Publisher=scn.nextLine();
		System.out.println("Enter Price");
		Book2.Price=scn.nextFloat();
		
		System.out.println(Book2.Title);
		System.out.println(Book2.Author);
		System.out.println(Book2.Price);
		System.out.println(Book2.Publisher);
		Book2.print();
		
	}
	
}
