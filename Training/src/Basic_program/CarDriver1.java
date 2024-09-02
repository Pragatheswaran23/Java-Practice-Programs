package Basic_program;

public class CarDriver1 {
	
	public static void main(String[] args) {
		
		//create a instance
		Car c1 = new Car( "city" );
		//fetch and print car model name & cc
		System.out.println("Model : " + c1.getModelName());
		System.out.println("HP : " + c1.getEngine().getHp());
	}

}