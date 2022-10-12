package Abstract;

public class Employee extends Person{
	
	int empID;
	public Employee() {}
	public Employee(String name, int age, int empID) {
		
		super (name,age);
		this.empID=empID;
		System.out.println("Employee constructor");
	} public void doSomething() {
		System.out.println("Employees work to earn their salary");
	}
	
}
