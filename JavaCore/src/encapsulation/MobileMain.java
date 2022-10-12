package encapsulation;

public class MobileMain {
	public static void main(String[] args) {
		Mobile x=new  Mobile();
		x.setBrand("Apple");
		System.out.println(x.getBrand());
		x.setRAM(8);
		System.out.println(x.getRAM());

	}
}
