package BuilderPattern;

public class BuilderMain {
	public static void main(String[] args) {
		Product obj1=new ProductBuilder()//object of productbuildier
				.name("TV")
				.buildProduct();
		Product obj2=new ProductBuilder()
				.name("Mobile")
				.brand("apple")
				.buildProduct();
		Product obj3=new ProductBuilder()
				.name("TV")
				.brand("Samsung")
				.price(1000)
				.buildProduct();
		System.out.println();
	}

}
