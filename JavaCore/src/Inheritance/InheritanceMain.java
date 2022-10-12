package Inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		
		//Person p=new Person();
		//Employee e=new Employee();
		
		Manager m=new Manager("hasan", 26, 1453, "Trainee"); 
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.empID);
		System.out.println(m.dept);
		System.out.println("End of code");
		m.doSomething();
	}
}
