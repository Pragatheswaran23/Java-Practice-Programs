package Basic_program;

public class CircleTest {
	
	public static void main(String[] args) {
		Circle c1 = new Circle( 2 );
		Circle c2 = new Circle( 3 );
		
		System.out.println(Circles.computeDiameter(c1));
		System.out.println(Circles.computeDiameter(c2));
		
		System.out.println(Circles.computeArea(c1));
		
		System.out.println(Circles.computeCircum(c2));
	}

}
