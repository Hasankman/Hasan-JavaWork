package Constructor;

public class person {
	String name;
	int age;
	String address;
	int phone;
	
	//public person(){}
	public person() {
		System.out.println("person class instantiated");
	}

	public person(String n, int a, String add, int p) {
		name=n;
		if(a<=0) {
			System.out.println("age can not be zero");
		}else {
			age=a;
		}
		address=add;
		phone=p;
	}
	
	public person(String n, int a) {
		name=n;
		if(a<=0) {
			System.out.println("age can not be zero");
		}else {
			age=a;
		}
		
	}
}
