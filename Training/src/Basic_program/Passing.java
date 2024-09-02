package Basic_program;

class Box{
	
}

public class Passing {
	public static void displayReference(Box b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		Box b1 = new Box();
		displayReference(b1);
		Box b2 = new Box();
		displayReference(b2);
	}
}
