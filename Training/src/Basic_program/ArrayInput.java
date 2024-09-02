package Basic_program;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		int [] arr = new int[4];
		
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		s.close();
	}
}