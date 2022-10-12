package Serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee(1001, "Hasan", 1750, "IT", "Hasan.k@gmail.com");
		try {
			//...............Write Operation...............
			//To create a file
			FileOutputStream fileOut=new FileOutputStream("ObjEmployee.txt");
			//To convert a Object into a stream of byts
			ObjectOutputStream eOut=new ObjectOutputStream(fileOut);
			//To write into the file
			eOut.writeObject(emp);
			
			//...............Read Operation...............
			FileInputStream fileIn=new FileInputStream("ObjEmployee.txt");
			//To convert byts to Objects
			ObjectInputStream eIn=new ObjectInputStream(fileIn);
			Employee empCopy=(Employee)eIn.readObject();
			System.out.println(empCopy.empId);
			System.out.println(empCopy.name);
			System.out.println(empCopy.salary);
			System.out.println(empCopy.designation);
			System.out.println(empCopy.email);
			
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}


	}

}
