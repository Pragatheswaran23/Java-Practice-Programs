package Basic_program;

public class Constructor {
	int a=10;
	static Constructor con = new Constructor();
	Constructor(){
		this(10);
		
	}
	Constructor(int a){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		System.out.println(con);
	}
	
	
	
	

}
