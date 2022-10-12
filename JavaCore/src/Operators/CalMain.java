package Operators;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		Operators cal = new Operators();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.minus(10, 20));
		System.out.println(cal.multi(10, 20));
		System.out.println(cal.div(10, 20));

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first no");
		int a=scn.nextInt();
		System.out.println("Enter second no");
		int b=scn.nextInt();
		System.out.println("Enter your choice");
		System.out.println("1: Addition");
		System.out.println("2: Difference");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		int ans = scn.nextInt();
		switch (ans) {
		case 1:
			System.out.println(cal.add(a,b));
			break;
		case 2:
			System.out.println(cal.minus(a,b));
			break;
		case 3:
			System.out.println(cal.multi(a,b));
			break;
		case 4:
			System.out.println(cal.div(a,b));
			break;
		default:
			System.out.println("Please select a valid input");

		}

	}

}

