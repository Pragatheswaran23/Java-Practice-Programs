package Basic_program;

public class CarDriver {
	
	public static void main(String[] args) {
		Cars c = new Cars();
		
		//to print all brand 
		for (int i=0; i<c.getTyre().length; i++) {
			System.out.println(c.getTyre()[i].getBrand());
		}
	}

}
