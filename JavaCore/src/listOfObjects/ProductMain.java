package listOfObjects;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		Product prod1=new Product("Bluetooth", 15, 40, "Boat");
		//System.out.println(prod1.toString());
		Product prod2=new Product("TV", 1050, 10, "Samsung");
		//System.out.println(prod2.toString());
		Product prod3=new Product("Camera", 750, 20, "Canon");
		//System.out.println(prod3.toString());
		Product prod4=new Product("Tripod", 35, 50, "DigiTech");
		//System.out.println(prod4.toString());
		
		//System.out.println("List method---------");
		ArrayList<Product> list=new ArrayList();
		list.add(prod1);
		list.add(prod2);
		list.add(prod3);
		list.add(prod4);
		list.add(new Product("Lipstick", 20, 100, "mac"));
		//System.out.println(list);
		
		//System.out.println("for loops-------");
		
		for(int i=0; i<list.size(); i++) 
			{
			 if(list.get(i).price>100 && list.get(i).quantity>5) {
				 
			 System.out.println(list.get(i)); 
			 } 
		}
		
		Product p=new Product();
		p.getProduct(list);
		
		
		
	}

}
