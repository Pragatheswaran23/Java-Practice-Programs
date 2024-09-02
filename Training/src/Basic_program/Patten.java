package Basic_program;

public class Patten {
	public static void main(String[] args) {
		String name = "PRASANTH";
		
		char[] nameArray = name.toCharArray();
		
		for (int i=0; i<nameArray.length ; i++ ) {
			for(int j=0; j<=i; j++) {
				System.out.print(nameArray[j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		/*for (int i=0; i < 5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}*/
	}

}
