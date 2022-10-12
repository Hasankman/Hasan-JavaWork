package Arrays;

public class ListOfArrays {
	public static void main(String[] args) {
		//Declare
		//Instantiate
		//Initialize
		
		String[] student;//Declare
		student=new String[5];//Instantiate
		student[0]="Hasan";//Initialize
		student[1]="Ece";
		student[2]="Helin";
		student[3]="Baran";
		student[4]="Tolgay";
		
		String[] city=new String[5];//Declare //Instantiate
		city[0]="London";//Initialize
		city[1]="Paris";
		city[2]="Istanbul";
		city[3]="New-York";
		city[4]="Dubai";
		
		String[] fruits= {"Banana", "Apples", "Grapes", "Avocado", "Pinapple", "Guava"};
		
		System.out.println("List starts ---------");
		
		System.out.println("Students ---------");
		for(int i=0; i<student.length; i++)
		{
			System.out.println(student[i]);
		}
		
		System.out.println("Citys ---------");
		
		for(int i=0; i<city.length; i++) 
		{
			System.out.println(city[i]);
		}
		
		System.out.println("Fruits ---------");
		
		for(int i=0; i<fruits.length; i++) 
		{
			System.out.println(fruits[i]);
		}
		
		System.out.println("ZipCode ---------");
		int[] zipcode={234, 345, 3234, 6786, 56765, 83758, 83583,}; 
		for(int i=0; i<zipcode.length; i++)
		{
			System.out.println(zipcode[i]);
		}
		
}
}