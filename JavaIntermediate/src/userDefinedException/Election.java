package userDefinedException;

public class Election {
	public void checkElegibility(int age) throws InvalidAgeException {
		
		if(age<18)
			throw new InvalidAgeException("You have to be min 18 to vote");
		else
			System.out.println("Please cast your vote");
	}
}
