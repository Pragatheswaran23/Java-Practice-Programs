package Basic_program;

public class StaticAndNon {
	int a = 20;
	static int b = 20;
	
	{
		a=10;
		test();
		
	}
	public void test() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
	

}
