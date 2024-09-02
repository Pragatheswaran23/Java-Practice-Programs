package Basic_program;

public class Initiliazer {
	
	static int i = type();
	
	static public int type() {
		System.out.println("from type i : " + i);
		return 10;
	}
	
	public static void main(String[] args) {
		System.out.println("main : " + i);
	} 

}
