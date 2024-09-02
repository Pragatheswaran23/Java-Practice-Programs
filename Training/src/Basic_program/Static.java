package Basic_program;

public class Static {
	static int a;
	public static void main(String[] args) {
		Static ob = new Static();
		System.out.println(ob.a);
		ob.fun();
	}
	
	static void fun() {
		System.out.println("1234");
		
	}

}
