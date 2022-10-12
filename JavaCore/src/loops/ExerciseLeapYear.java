package loops;


public class ExerciseLeapYear {

	public static void main(String[] args) {
		int year = 1900;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("This is leap");
				} else {
					System.out.println("not a leap");
				}
			} else {
				System.out.println("leap");
			}
		} else {
			System.out.println("its not leap");
		}
	}
}
