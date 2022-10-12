package loops;

public class continuebreak {

	public static void main(String[] args) {
		for(int i=0; i < 10; i++) {
			if(i== 2) {
				/*continue skips the number 
				 * and continues the loop*/
				continue;
			}
			if(i==7) {
				/*break ends the loop and
				 *  stops the count in this case*/ 
				break;
			}
			System.out.println(i);
		}

	}

}
