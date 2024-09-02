package Basic_Programs;

public class ObjectString {
	
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "World";
		String conRes = str1.concat(str2);
		System.out.println(conRes);
		
		String str3 = "Hello";
		String str4 = "hello";
		boolean ignorCase = str3.equalsIgnoreCase(str4);
		System.out.println(ignorCase);
		
	}

}
