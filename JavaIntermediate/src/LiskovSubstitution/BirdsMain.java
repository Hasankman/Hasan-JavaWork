package LiskovSubstitution;

import Open_Closed.Animal;

public class BirdsMain {

	public static void main(String[] args) {
		Animal an=new Animal();
		Owl o=new Owl();
		an.learnToFly(o);
		
		

	}

}
