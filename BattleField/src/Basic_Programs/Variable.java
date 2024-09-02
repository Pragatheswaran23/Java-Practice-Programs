package Basic_Programs;

public class Variable {
	static byte b=-1;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean bool;
	Variable v;
	
	public static void main(String[] args) {
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.err.println(bool);
		
	}
	
	void variable(){
		System.out.println(v);
	}
}
