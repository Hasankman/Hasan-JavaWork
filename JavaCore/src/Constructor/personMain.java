package Constructor;

public class personMain {
	public static void main(String[] args) {
		person p1=new person();
		p1.name="Hasan";
		p1.age=25;
		p1.address="London";
		p1.phone=78394757;
		
		person p2=new person("Ece", 24, "Turkey", 3748476);		
		person p3=new person("helin", 16, "Hackney", 574836483);	
		person p4=new person("selin", 19);	
		p4.address="Islington";
		p4.phone=76374638;
		person p5=new person("baran", 22);
	}
}
