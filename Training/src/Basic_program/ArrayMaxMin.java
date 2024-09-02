package Basic_program;

import java.util.Arrays;

public class ArrayMaxMin {
	
	public static void main(String[] args) {
		int[] ar = {10,2,34,5,7,23,10, 34};
		
		System.out.print("Array :");
		System.out.println(Arrays.toString(ar));
		
		int max = 0;
		int min = ar[0];
		
		for (int a : ar) {
			if (max < a) max = a;
			if (min > a) min = a;
		}
		
		System.out.println("Max : " + max + "\nMin : " + min);
		
	}

}
