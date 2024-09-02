package Basic_Programs;

public class Reverse {
	public static void main(String[] args) {
		System.out.println("Numbers from 10 to 0 :");
		reverse();
		
		System.out.println("\n\nAscii value of a - z :");
		ascii('a', 'z');
		
		System.out.println("\n\nAscii value of A - Z :");
		ascii('A', 'Z');
	}
	
	static void reverse() {
		for (int i=10; i!=-1; i--) {
			System.out.print(i + " ");
		}
	}
	
	static void ascii(char C1, char L1) {
		while (C1 <= L1){
			int A1 = C1;
			System.out.print(C1 + "-" + A1 + ", ");
			C1 = (char) ++A1;
		}
	}

}
