package SwitchStatment;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		char Operator; 
		double num1, num2, result;
				
		//Scanner must be used to request a input
		Scanner scn=new Scanner(System.in);
		
		//Ask user to input the first Number 
		System.out.println("Please Enter Numbers");
		num1 = scn.nextDouble();	
		
		//We should then ask the user to insert a operator
		System.out.println("Choose an Operator: +, -, *, or /");
		Operator = scn.next().charAt(0); 
				
		//Ask the user the Second Number
		System.out.println("Please Enter Numbers");
		num2 = scn.nextDouble();
		
		switch (Operator) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + "=" + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + result);
			break;
		default:
			System.out.println("Please Enter a Valid Operation");
		}
		
	}
}
