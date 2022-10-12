package importing;
 import java.util.Scanner;

public class temp {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Please print your name");
	String name=scn.next();
	System.out.println("Please enter your second name");
	String SecondName=scn.next();
	System.out.print("Enter year of birth ");  
	int  year=scn.nextInt();
	System.out.println("Hello " + name + " " +SecondName + " Welcome to the world of java you was born in " + year);
	
	
	}
}
