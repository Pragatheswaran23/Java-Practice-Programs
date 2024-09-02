package Basic_program;

public class StaticDeclaration {
	static int i = 420;
	static {
		i=10;
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		char a = 1;
		int b = 'a';
		System.out.println(a);
		System.out.println(b);
	}

}
