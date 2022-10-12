package Inheritance;

public class Employee extends Person{
	
	int empID;
	public Employee(String name, int age, int empID) {
		
		//super()  calls the constructor of super class
		//Public person(){}
		super (name,age);
		this.empID=empID;
		System.out.println("Employee constructor");
	} public void doSomething() {
		System.out.println("Employees work to earn their salary");
	}
	
}
