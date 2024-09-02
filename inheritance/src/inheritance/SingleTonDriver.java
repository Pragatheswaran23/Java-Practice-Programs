package inheritance;

public class SingleTonDriver {
	
	public static void main(String[] args) {
		System.out.println(SingleTon.t);
		SingleTon.getRef();
		System.out.println(SingleTon.t);
		SingleTon.getRef();
		System.out.println(SingleTon.t);		
	}

}
