package inheritance;

public class SingleTon {
	
	static SingleTon t;   //class reference variable

	
	private SingleTon() {
		//empty private constructor
	}
	
	static SingleTon getRef() { //helper method
		
		//checking t is null or not to keep it same always
		if (t==null) {
			t = new SingleTon();
		}
		
		
		return t;
	}
	
	
	

}
