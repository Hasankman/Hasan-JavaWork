package Lambda;

public class Test {

	public static void main(String[] args) {
		//Person p=new Person();
		//p.great();
		//Greeting gr=new Greeting();//Not Allowed
		//Greeting gr=new Person();//dependency on class person 
		
		//Anonymous	class
		Greeting gr=new Greeting() {
			public void greet() {
				System.out.println("Hello World");
			}
			public void welcome() {
				System.out.println("Welcome to the world of java");
			}
			
		};
		gr.greet();
		gr.welcome();
	}

}
