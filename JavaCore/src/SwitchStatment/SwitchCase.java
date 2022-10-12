package SwitchStatment;

public class SwitchCase {
	public static void main(String[] args) {
		String Continents= "Europe";
		switch (Continents) {
		case "Asia":
			System.out.println("Population=3,261,050,390 , Area=31,033,131KM ");
			break;
		case "Africa":
			System.out.println("Population=1,340,598,147, Area=29,648,481KM ");
			break;
		case "Europe":
			System.out.println("Population=747,636,026, Area=22,134,900KM ");
			break;
		case "North America":
			System.out.println("Population=592,072,212, Area=21,330,000KM ");
			break;
		case "South America":
			System.out.println("Population=430,759,766, Area=17,461,112KM ");
			break;
		case "Australia/Oceania":
			System.out.println("Population=43,111,704, Area=8,486,460KM ");
			break;
		case "Antarctica":
			System.out.println("Population=0, Area=13,720,000 ");
			break;
		default:
			System.out.println("Are you from earth?");
		}
		
	}

}
