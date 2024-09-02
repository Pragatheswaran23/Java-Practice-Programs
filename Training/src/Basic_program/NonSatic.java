package Basic_program;

public class NonSatic {
	{
	System.out.println("abcd");
	}
	
	public static void main(String[] args) {
		NonSatic obj = new NonSatic();
		System.out.println("efg");
		
	}
	
	{
		System.out.println("hij");
	}
}
