package polymorphism;

public class PolymorphismMain {

	public static void main(String[] args) {
		Liquid l=new Liquid();
		Milk m=new Milk();
		Tea t=new Tea();
		Coffee c=new Coffee();
		Mug mg=new Mug();
		Juice j=new Juice();
		mg.addLiquid(l);
		mg.addLiquid(m);
		mg.addLiquid(t);
		mg.addLiquid(c);
		mg.addLiquid(j);

	}

}
