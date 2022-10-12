package StringManipulation;

public class CreatingStringUsingArrays {
	public static void main(String args[]) {
	      char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' }; // an array of chars
	      String helloString = new String(helloArray);  
	      System.out.println(helloString); // prints out Hello.
	   }
}
