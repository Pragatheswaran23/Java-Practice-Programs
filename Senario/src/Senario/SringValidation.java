package Senario;

import java.util.Arrays;
import java.util.Scanner;

public class SringValidation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		
		char[] ch = input.toCharArray();
		
		System.out.println(Arrays.toString(ch));
	}
}
