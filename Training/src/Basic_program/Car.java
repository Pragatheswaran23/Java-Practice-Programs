package Basic_program;

public class Car {
	
	private String modelName ;

	//getter
	public String getModelName() {
		return modelName;
	}

	//setter
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
		// Achieve Has-A with Engine 
		private Engine  e = new Engine(1200);
		
		//getter
		public Engine getEngine() {
			return e;
		}
		
	//Constructor 
	Car(){
		
	}
	//Constructor to initialize modelName
	Car(String modelName){
		setModelName(modelName);
	}

}
