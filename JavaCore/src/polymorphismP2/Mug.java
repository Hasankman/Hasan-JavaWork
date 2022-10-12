package polymorphismP2;

public class Mug {
	public void addLiquid(Liquid x) 
	{
		if(x instanceof Milk)
			System.out.println("swirling milk");
		else if(x instanceof Tea)
			System.out.println("swirling Tea");
		else if(x instanceof Juice)
			System.out.println("swirling Juice");
		else if(x instanceof Coffee)
			System.out.println("swirling coffee");
		else
			System.out.println("swirling some liquid");

	}

}
