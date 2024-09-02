package Basics_Package;

public class Method1 {
	
	static int praga(int a, int b) {
		return a+b;
	}
	
	void demo(int a) {
		System.out.println("demo");
	}
	

	public static void main(String[] args) {
		//int res = praga(2, 4);
		//System.out.println(res);
		
		Method1 va = new Method1();
		
		va.demo(8);
		
		PiValue pi = new PiValue();
		
		pi.Pramod();
		
		 
	}
}
