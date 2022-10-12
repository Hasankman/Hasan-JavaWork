package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateTest {
	//Takes 1 and returns 1 value
	public static void main(String[] args) {
		Predicate<Integer> pred=a->(a>10);
		System.out.println(pred.test(5));
	}
}
