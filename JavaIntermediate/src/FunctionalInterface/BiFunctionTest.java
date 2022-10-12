package FunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionTest {
	public static void main(String[] args) {
		//Takes 2 args and returns 1 args
		//First two is input and last one is output
		BiFunction<Integer,Integer,Integer> bif=(a,b)->(a*b);
		System.out.println(bif.apply(22, 44));
		
		BiFunction<String,String,String> bif1=(a,b)->("hello "+a+" "+b);
		System.out.println(bif1.apply("John","Doe"));
		
		
	}
}

