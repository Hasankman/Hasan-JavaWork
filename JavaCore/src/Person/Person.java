package Person;

import java.util.ArrayList;
import java.util.Scanner;

import listOfObjects.Product;

public class Person {
	String name;
	int age;
	String jobTitle;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public void getPerson(ArrayList<Person> list)
	{
	
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name");
		String findName=scn.next();
		for(int i=0;i<list.size();i++)
		{
			
			if(list.get(i).name.equals(findName))
			{
				System.out.println(list.get(i));
			}
		}
	}

	
	public Person() {
		super();
	}
	
	public Person(String name, int age, String jobTitle) {
		this.name=name;
		this.age=age;
		this.jobTitle=jobTitle;
		
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]\n \n";
	}
	
	
}
