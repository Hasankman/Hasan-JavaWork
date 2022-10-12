package Methods;

public class TVTest {

	public static void main(String[] args) {
		Television tele=new  Television();
		tele.brand= "Samsung";
		tele.price= 1200;
		tele.screenSize= 55;
		tele.turnOn();
		//method one get a return values from a java method
		int x=tele.switchToAChannel();
		System.out.println(x);
		System.out.println(tele.switchToAChannel());
		
		//method two get a return values from a java method
		double discount=tele.getDiscount();
		System.out.println(discount);

		double discountOnBF=tele.discountOnBlackFriday(30);
		System.out.println(discountOnBF);

		double discountAtTheEnd=tele.discountOnBlackFriday(50);
		System.out.println(discountAtTheEnd);
		
		double totalDiscount=tele.dicountWithCityBank(30, 25);
		System.out.println(totalDiscount);

	}

}
