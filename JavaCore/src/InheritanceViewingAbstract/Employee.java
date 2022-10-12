package InheritanceViewingAbstract;

public class Employee extends Person{
	int empId;
	public Employee() {}
	public Employee(String name,int age,int empId)
	{
		super(name,age);
		this.empId=empId;
		System.out.println("Employee contructor");
	}
	public void doSomething()
	{
		System.out.println("Employees work to earn their salary");
	}
	
	public void display()
	{
		System.out.println("Display from employee");
	}

}

