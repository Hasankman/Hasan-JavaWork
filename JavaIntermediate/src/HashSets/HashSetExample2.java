package HashSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample2 {
	    public static void main(String[] args) {
	       List<String> list=new ArrayList(4);
	       list.add("Hasan");
	       list.add("Ece");
	       list.add("Helin");
	       list.add("Baran");
	       System.out.println(list);
	       
	       Set<String> set=new HashSet();
	       set.add("Bannana");
	       set.add("Apple");
	       set.add("Fig");
	       set.add("Bannana");
	       set.add("Guava");
	       set.add("Pinaapple");
	       set.add("Mango");
	       System.out.println(set);
	       
	       Set<String> set1=new TreeSet<>();
	       set1.add("Bannana");
	       set1.add("Apple");
	       set1.add("Fig");
	       set1.add("Bannana");
	       set1.add("Guava");
	       set1.add("Pinaapple");
	       set1.add("Mango");
	       System.out.println(set);
	}

}