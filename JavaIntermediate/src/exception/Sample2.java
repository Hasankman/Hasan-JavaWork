package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample2 {
	public static void main(String[] args) {
		System.out.println("Somthing before try-catch");
	try {
		int x=10;
		int y=2;
		int z= x/y; //logical issue
		int[] nums= new int[5];
		nums[4]= 200;
		Connection con=DriverManager.getConnection("","","");
		con.close();
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException | SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("We can not");
		}finally {
			
			System.out.println("I will get executed always");
		}
		System.out.println("Somthing after try-catch");
	}
}
