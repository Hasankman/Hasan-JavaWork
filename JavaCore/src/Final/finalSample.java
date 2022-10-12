package Final;

public class finalSample {
	final int x=100;//decleration has been made 
	final int y;
	static final int big=555;
	
	public finalSample() {//in the constructor 
		this.y=333;
	}
	public finalSample(int temp) {//in the constructor 
		this.y=temp;
	}
	public finalSample(int a, int b) {//in the constructor 
		b++;
		this.y=a;
	}
}
