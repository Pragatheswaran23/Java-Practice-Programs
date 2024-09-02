package Basic_Package;

public class Ex2 {
	 public static void main(String[] args) {
		 boolean r = lastDigit(23, 52);
		 System.out.println(r);
	 }
	 
	 static boolean lastDigit(int a, int b) {
		 if ((a%10) == (b%10)) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }

}
