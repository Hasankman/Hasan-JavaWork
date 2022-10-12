package InheritanceViewingAbstract;

public class InheritanceMain {
	public static void main(String[] args) {
		//Person p=new Person();
		
		//Employee e=new Employee();
		Person p1=new Employee();
		Person p2=new Student();
		Person p3=new Manager();
		
		Manager m=new Manager("hasan", 26, 1453, "Trainee"); 
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.empId);
		System.out.println(m.dept);
		System.out.println("End of code");
		m.doSomething();
		
		Employee emp=new Employee();//parent
		emp.display();
		Manager man=new Manager();
		man.display();//display from manager
		Employee e1=(Employee)man;
		e1.display();
		
		Employee emp1=new Employee();
		Person p=(Person)emp1;
		p.doSomething();
	}
}
