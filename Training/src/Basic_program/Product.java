package Basic_program;

public class Product {
	private double price;
	private int quantity;
	private int value;
	
	Product (double price,int quantity){
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setPrice(double price) {
		if (price>0) this.price = price;
		else System.err.println("Invalid amount");
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setQuantity(int quantity) {
		if (quantity>0) this.quantity = quantity;
		else System.err.println("Invalid Quantity");
	}
	
	public int getQuantity() {
		return quantity;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


	

}
