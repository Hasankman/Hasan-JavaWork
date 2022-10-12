package Inheritance;

public class Person {
	String name;
	int age;
	public Person(String name, int age ) {
		
		this.name=name;
		this.age=age;
		System.out.println("Person Constructor");
	} public void doSomething() {
		System.out.println("People work to in a job to earn their salary");
	}
}
