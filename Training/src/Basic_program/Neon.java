package Basic_program;

import java.util.Scanner;

public class Neon {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = s.nextInt();
		
		int tem = num*num;
		int sum=0;
	
		/*while (tem > 0) {
			sum += tem%10;
			tem /= 10;
		}*/
		
		for (; tem > 0; tem /= 10) 
			sum += tem%10;
		
		
		if (sum == num) {
			System.out.println("Neon");
		}else {
			System.out.println("Not Neon");
		}
		s.close();
	}

}
