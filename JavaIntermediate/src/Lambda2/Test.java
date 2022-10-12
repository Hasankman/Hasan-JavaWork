package Lambda2;

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
			/*
			 * public void welcome() { System.out.println("Welcome to the world of java"); }
			 */
			
		};
		gr.greet();
		//gr.welcome();
		
		//Anonymous	class
		//Lambda expression 
		//Leftside -> Rightside
		//Argument -> body
		//() -> { Printing/Calculation}
		
		//Lambda without any args and no return type 
		Greeting gr1=() ->{ System.out.println("Hello World");};
		gr1.greet();
		
		//Lambda with args and no return type 
		GreetingWithName grName=(x) -> { System.out.println("Hello "+ x);};
		grName.greet("Hasan");
		
		//Lambda with args and with return type 
		GreetingWithReturn grReturn=(x) -> { return "Hello "+ x ; };
		System.out.println(grReturn.greet("Hasan")); 
		
		
		
		
	}

}
