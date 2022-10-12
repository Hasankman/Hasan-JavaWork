package FileIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
	public static void main(String[] args) {
		Path path = Paths.get("/Users/k.man/Desktop/QA bootcamp/QAFileExample/Hasank.txt");
	      System.out.println("Absolute Path:"+path.isAbsolute());
	      System.out.println("FileName:"+path.getFileName());
	      System.out.println("Absolute Path:"+path.toAbsolutePath().toString());
	      System.out.println("Root:"+path.getRoot());
	      System.out.println("Parent:"+path.getParent());
	      System.out.println("Name Count:"+path.getNameCount());
	      System.out.println("Get first name:"+path.getName(0));
	      System.out.println("Subpath:" +path.subpath(0, 3));
	      System.out.println("Names in path:"+path.getNameCount());
	}
}
