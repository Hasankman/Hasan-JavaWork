package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecords {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/javadb"; 
			String userName="root";
			String password="Turkiye123";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection successfull");
			
			/***********New CODE***********/
			
			String query="Select * from customer";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int phone=rs.getInt(3);
				String email=rs.getString(4);
				System.out.println("***"+id+"***"+name+"***"+phone+"***"+email+"***");
			}
			
			/***********New CODE***********/
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("something whent wrong");
		}
	}
}
