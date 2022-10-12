package HashSets;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	    public static void main(String[] args) {
	        Set<String> hashSet = new HashSet();
	        hashSet.add("B");
	        hashSet.add("C");
	        hashSet.add("A");
	        hashSet.add("E");
	        hashSet.add("D");
	        hashSet.add("F");
	        hashSet.add("F"); // this will overwite the previous "F", as duplicate values are not permitted
	        System.out.println(hashSet);
	        System.out.println(hashSet.isEmpty());
	        if (hashSet.size() == 0 ){
	            System.out.println("HashSet is empty");
	        }
	        else {
	            System.out.println(hashSet.size());
	        }
	        hashSet.remove("A");
	        
	    }
	}
