package encapsulation;

public class Mobile {
	private String brand;
	private int RAM;
	private String color;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
		
	switch (brand) {
		case "Samsung":
			this.brand = brand;
			break;
		case "Apple":
			this.brand = brand;
			break;
		case "Sony":
			this.brand = brand;
			break;
		default:
			System.out.println("Not a valid brand");
		}

	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
		
	if(rAM>12)
		{
			System.out.println("Invalid RAM size");
		}else {
			this.RAM=rAM;
		}
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
