package FileIO;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class Readers {
	public static void main(String[] args) {
		try {
			Reader r=new FileReader("/Users/k.man/Desktop/QA bootcamp/QAFileExample/Hasank.txt");
			int data=r.read();//only first character
			while(data != -1) // loops through all the char until it reaches end of file
			{
				System.out.print((char)data);
				data=r.read();//read next character 
			}
			//System.out.println(data);
		}catch (IOException e) {
			//TODD Auto-generate catch block
			e.printStackTrace();
		}
	}
}
