package Static;

public class staticMain {
	public static void main(String[] args) {
		staticSample obj1=new staticSample();//101
		obj1.x=10;
		System.out.println(obj1.x);
		obj1.x++;
		System.out.println(obj1.x);
		System.out.println(staticSample.staticX);//102
		System.out.println(staticSample.staticX);//103
		
		staticSample obj2=new staticSample();//104
		obj2.x=20;
		System.out.println(obj2.x);
		obj2.x++;
		System.out.println(obj2.x);
		System.out.println(staticSample.staticX);//105
		
		staticSample obj3=new staticSample();//++//106
	
		System.out.println(staticSample.staticX);
	}
}
