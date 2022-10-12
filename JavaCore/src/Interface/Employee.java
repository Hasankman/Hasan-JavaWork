package Interface;

public class Employee extends Person implements Artist,Player{
	public void doSomething() {
		
		System.out.println("Every employee has job profile to perform his duty");
		
	} public void doArt() {
		
		System.out.println("Employees can also be intrested in some art");
		
	} public void doPlay() {
		
		System.out.println("Playing something is always good for mental and physical health");
		
	} public void do1() {
		
		System.out.println("everything is doable");
		
	}

}
