package FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	   public static void main(String[] args) {
		    //takes 2 args conditions with different values 
		    //

	        BiPredicate<String, Integer> filter = (x, y) -> {
	            return x.length() == y;
	        };

	        boolean result = filter.test("mkyong", 6);
	        System.out.println(result);  // true

	        boolean result2 = filter.test("java", 10);
	        System.out.println(result2); // false
	    }

}
