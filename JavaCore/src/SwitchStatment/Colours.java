package SwitchStatment;

import java.util.Scanner;

public class Colours {
	public static void main(String[] args) {
	/*this could be done in two ways either 
	 * a request in the code or by using a 
	 * scanner to input the request */
	String basicColour = "blue";
	
//	Scanner scn=new Scanner(System.in);
//	String basicColour=scn.next();
	
	switch (basicColour) {
	case "blue":
		System.out.println("You got Blue");
		break;
	case "red":
		System.out.println("You got Red");
		break;
	case "green":
		System.out.println("You got Green");
		break;
	case "yellow":
		System.out.println("You got Yellow");
		break;
	default:
		System.out.println("Please Enter a Valid Colour");
	}
	}
	
	
}
