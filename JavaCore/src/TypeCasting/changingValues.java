package TypeCasting;

public class changingValues {
	
	public static void main(String[] args) {
		int x;//32 bit of data
		long y=2637485L;// 64 bit of data
		x=(int)y;
		System.out.println(x);
		
		float m=234.456f;
		int n=(int)m;
		System.out.println(n);
		
		char [] h= {'h', 'a', 's'};
		
		String temp=h.toString();
		System.out.println(temp);
		
		char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' }; // an array of chars
	     String helloString = new String(helloArray); 
	     System.out.println(helloString);
		

	}
	
}
