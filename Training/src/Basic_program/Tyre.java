package Basic_program;

public class Tyre {
	
	private String brand;
	
	//getter and setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	//constructor
	public Tyre() {
		
	}
	
	public Tyre(String brand) {
		setBrand(brand);
	}


}
