package FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {
	public static void main(String[] args) {
		try {
			Writer w=new FileWriter("/Users/k.man/Desktop/QA bootcamp/QAFileExample/Hasank.txt");//open the file if exist or create new 
			String content="welcom to the world of java, I will take you through the core consepts of java";
			w.write(content);//does the writing
			w.close();//closes the file
			System.out.println("File written successfully");
		} catch (IOException e) {
			//TODD Auto-generate catch block
			e.printStackTrace();
		}
	}

}
