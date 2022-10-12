package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JavaDataBaseConnect {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/javadb"; 
			String userName="root";
			String password="Turkiye123";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection successfull");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("something whent wrong");
		}
	}
}
