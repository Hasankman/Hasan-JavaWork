package Arrays;

import java.util.Scanner;

public class ArrayLoops {
	public static void main(String[] args) {
		String[] city=new String[5];
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Names of Cities");
		for(int i=0; i<city.length; i++) 
		{
			city[i]=scn.nextLine();
		}
		System.out.println("list of Cities");
		for(int i=0; i<city.length;i++) 
		{
			System.out.println(city[i]);
		}
		
		//enhanced for loop array for loops
		System.out.println("List of Cities");
		for(String x:city) 
		{
			System.out.println(x);
		}
		int[] marks=new int[5];
		marks[0]=100;
		marks[1]=200;
		marks[2]=300;
		marks[3]=400;
		marks[4]=500;
		
		System.out.println("List of Marks");
		for(int x:marks)
		{
			System.out.println(x);
		}
	}
}
