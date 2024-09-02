package Basic_program;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Calc:");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Mul");
		System.out.println("Enter your choose : ");
		int n = in.nextInt();
		
		switch (n){
		case 1:{
			System.out.println("Add");
		}
			break;
		case 2:
			System.out.println("Sub");
			break;
		case 3:
			System.out.println("Mul");
		default:
			System.out.println("Default");
		}
			
		
		in.close();
		
		
	}

}
