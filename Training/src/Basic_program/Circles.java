package Basic_program;

public class Circles {
	
	public static double computeDiameter(Circle c) {
		return 2 * c.getRadius();
	}
	
	public static double computeArea(Circle c) {
		return (22.0/7.0) * c.getRadius() * c.getRadius();
	}
	
	public static double computeCircum(Circle c) {
		return 2 * (22.0/7.0) * c.getRadius();
	}

}
