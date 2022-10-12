package IfElseStat;

public class IfElse {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 25;
	if (num1>num2) {
		System.out.println("num1 is bigger");
	}else {
		System.out.println("num2 id bigger");
	}
	

	
	int x= 10;
	int y= 20;
	int z= 30;
	if(x>y && y>z) {
		System.out.println("x is the bigest");
	}else if(y>x && x>z) {
		System.out.println("y is the bigest");
	}else {
		System.out.println("z is the bigest");
	}
	
	String city="NewYork";
	if(city=="NewYork"){
		System.out.println("Welcom to NewYork");
	}else {
		System.out.println("You are somewhere else in the world");
	}
}

}