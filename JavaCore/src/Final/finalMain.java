package Final;

public class finalMain {

	public static void main(String[] args) {
		finalSample obj=new finalSample();
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		finalSample obj1=new finalSample(444);
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		finalSample obj2=new finalSample(111, 666);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		
		Country India=new Country(30);
		Country USA=new Country(40);
		Country Turkey=new Country(70);
		Country UK=new Country(20);
		Country xx=new Country();
		
		System.out.println(India.tax);
		System.out.println(USA.tax);
		System.out.println(Turkey.tax);
		System.out.println(UK.tax);
		System.out.println(xx.tax);

	}

}
