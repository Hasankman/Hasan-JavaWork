package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample {
	public static void main(String[] args) {
		try {
		int x=10;
		int y=2;
		int z= x/y; //logical issue
		int[] nums= new int[5];
		nums[4]= 200;
		Connection con=DriverManager.getConnection("","","");
		con.close();
		}catch (ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("We can not div a number by zero");
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			System.out.println("We can not place elements out of array boundrys");
		}catch (SQLException e){
			System.out.println(e.getMessage());
			System.out.println("Could not connect to the data base");
		}finally {
			System.out.println("I will get executed always");
		}
		
		//Connection con=DriverManager.getConnection("","","");
	}
}
