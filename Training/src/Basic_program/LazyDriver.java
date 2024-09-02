package Basic_program;

public class LazyDriver {

	public static void main(String[] args) {
		LazyCar c = new LazyCar();
		
		//add tyres
		c.addTyre(new Tyre("appollo"));
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("appollo"));
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("CRAFT"));
		
		for (int i=0; i<c.getTyres().length; i++) {
			System.out.println(c.getTyres()[i].getBrand());
		}
	}
	
}
