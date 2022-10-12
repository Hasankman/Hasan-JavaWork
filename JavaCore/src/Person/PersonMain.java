package Person;

import java.util.ArrayList;

import listOfObjects.Product;

public class PersonMain {
	public static void main(String[] args) {
		Person p1=new Person("Hasan", 26, "Software Engineer");
		System.out.println(p1.toString());
		Person p2=new Person("Ece", 24, "Fashion Designer");
		System.out.println(p2.toString());
		Person p3=new Person("Baran", 20, "Electrian");
		System.out.println(p3.toString());
		Person p4=new Person("Berkay", 21, "Accountant");
		System.out.println(p4.toString());
		
		
		System.out.println("ArrayList of persons-----------");
		ArrayList<Person> list=new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(new Person("Helin", 16, "Student"));
		list.add(new Person("Selin", 17, "Student"));
		System.out.println(list);
		
		System.out.println("for loop of specific persons-----------");
		for(int i=0; i<list.size(); i++) 
		{
		 if(list.get(i).age>17) {
			 
		 System.out.println(list.get(i)); 
		 } 
	}
		Person p=new Person();
		p.getPerson(list);
	}
	
}
