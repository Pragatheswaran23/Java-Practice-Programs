package Basic_program;


public class Driver {
	public static void main(String[] args) {
		Product ob = new Product(10, 2);
		ob.setPrice(20);
		System.out.println("Price : " + ob.getPrice() );
		
		System.out.println("Quantity before : " + ob.getQuantity());
		ob.setQuantity(4);
		System.out.println("Quantity after : " + ob.getQuantity());
	}

}
