package Basic_program;

public class Circle {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	Circle(){
		
	}
	
	Circle (double radius){
		setRadius(radius);
	}
}
