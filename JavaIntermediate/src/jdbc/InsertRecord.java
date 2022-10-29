package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/javadb"; 
			String userName="root";
			String password="Turkiye123";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection successfull");
			
			/***********New CODE***********/
			
			String query="insert into customer values(105,'Kev',88888,'k@gmail.com')";
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("One record inserted succesfully");
			
			/***********New CODE***********/
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("something whent wrong");
		}
	}
}
