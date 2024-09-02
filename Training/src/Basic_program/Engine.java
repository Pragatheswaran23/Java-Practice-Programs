package Basic_program;

/*
 * Engine class is the dependent class for Car
 */

public class Engine {
	
	private double hp;

	//getter
	public double getHp() {
		return hp;
	}

	//setter
	public void setHp(double hp) {
		this.hp = hp;
	}
	
	//constructor
	Engine(){
		
	}
	//constructor to initialize hp
	Engine(double hp){
		setHp(hp);
	}

}
