package Abstract;

public class Manager extends Employee {
	
	String dept;
	public Manager () {}
	public Manager(String name, int age, int empID, String dept) {
		
		//super()//  calls the constructor of super class
		super(name, age, empID);
		this.dept=dept;
		System.out.println("Manager constructor");
	}

}
