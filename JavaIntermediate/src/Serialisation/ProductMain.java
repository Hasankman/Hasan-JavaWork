package Serialisation;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProductMain {

	public static void main(String[] args) {
		Product prod=new Product(1001, "TV", 1000, "Apple");
		try {
			//...............Write Operation...............
			//To create a file
			FileOutputStream fileOut=new FileOutputStream("Object.txt");
			//To convert a Object into a stream of byts
			ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
			//To write into the file
			oOut.writeObject(prod);
			
			//...............Read Operation...............
			FileInputStream fileIn=new FileInputStream("Object.txt");
			//To convert byts to Objects
			ObjectInputStream oIn=new ObjectInputStream(fileIn);
			Product prodCopy=(Product)oIn.readObject();
			System.out.println(prodCopy.prodId);
			System.out.println(prodCopy.name);
			System.out.println(prodCopy.brand);
			System.out.println(prodCopy.price);
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}

	}

}
