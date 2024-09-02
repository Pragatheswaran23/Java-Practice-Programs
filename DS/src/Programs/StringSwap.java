package Programs;

public class StringSwap {
	
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hi";
		
		System.out.println("Before :");
		System.out.println("String 1 : " + s1);	
		System.out.println("String 2 : " + s2);
		
		int size1 = s1.length();
		int size2 = s2.length();
		
		s1 = s1 + s2;
		s2 = s1;

		s1 = s1.substring(size1, size1+size2);
		s2 = s2.substring(0, size1);
		
		System.out.println("\nAfter : ");
		System.out.println("String 1 : " + s1);	
		System.out.println("String 2 : " + s2);

		
	}

}
