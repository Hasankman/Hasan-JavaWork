package userDefinedException;

public class mainValidation {
	public static void main(String[] args) {
		Election obj=new Election();
		try {
			obj.checkElegibility(19);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		CheckCC obj1=new CheckCC();
		try {
			obj1.check("1234123412341234");
		} catch (CreditCardException e) {
			System.out.println(e.getMessage());
		}
	}

}
