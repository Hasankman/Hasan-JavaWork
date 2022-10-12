package IfElseStat;

import java.util.Scanner;

public class IfElseExer {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name please");
		String name=scn.next();
		System.out.println("Enter your city please");
		String city=scn.next();
//		String city="london"; scn.close();	
		if(city.equals("London")) 
			System.out.println("Heyy " + name + " you are a Brit");
		else if(city.equals("NewYork"))
			System.out.println("Heyy " + name + " you are a NewYorker");
		else
			System.out.println("I dont know");
			
	
	}

}
