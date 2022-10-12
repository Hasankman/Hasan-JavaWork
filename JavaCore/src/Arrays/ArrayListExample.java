package Arrays;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		int[] x=new int[5];
		ArrayList list=new ArrayList();
		list.add("Hasan");
		list.add("179.54");
		list.add("1995");
		list.add("ture");
		list.add("Y");
		
		System.out.println(list);
		
		ArrayList<String> names=new ArrayList(4);
		//ArrayList<String> names=new ArrayList<String>(4);
		names.add("Hasan");
		names.add("Ece");
		names.add("Bulut");
		names.add("baran");
		names.add("Helin");
		names.add("Tolgay");
		System.out.println(names);
		names.set(2, "Selin");
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.get(4));
		System.out.println(names.remove(3));
		System.out.println(names);
		
		System.out.println("Array List for loop");
		System.out.println(names);
		names.clear();
		for (int i = 0; i < names.size(); i++) {
		    System.out.println(names.get(i));
		}
		
	}
	
}
