package Basic_program;

import java.util.Scanner;

public class Inputs {
  static int ma() {
		return 1;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ma();
		System.out.println("Integer 1 : ");
		int a = input.nextInt();
		
		System.out.println("Integer 2 : ");
		int b = input.nextInt();
		
		int form= a+b;//addition
		
		System.out.println("sum:"+form);
		
		System.out.println("L/D");
		String s1 = input.next();
		
		String reply = (s1 == "L") ? "Thank you " : "Sorry";
		System.out.println(reply);
		
		System.out.println("Comment  :");
		
		String s2 = input.next();
		System.out.println("Comment Upladed " + s2);
		System.out.println("Bye");
		input.close();
	}

}
