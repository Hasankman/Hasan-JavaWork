package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String[] args) {
		
		try {
			String url="jdbc:mysql://localhost:3306/javadb"; 
			String userName="root";
			String password="Turkiye123";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection successfull");
			
			/***********New CODE***********/
			
			String query="update customer set phone=123433 where id=103;";
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("One record updated succesfully");
			
			/***********New CODE***********/
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("something whent wrong");
		}
	}
}
