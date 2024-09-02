package Basic_program;

import java.util.Arrays;

public class Shorting {
	
	public static void main(String[] args) {
		int array[] = {1,0,0,1,0,1};
		
		int count0 = 0;
		
		for (int i = 0; i<(array.length-1); i++) {
			if (array[i] == 0) count0 += 1;
			array[i] = 1;
		}
		
		for (int i = 0; i<count0; i++) {
			array[i] = 0;
		} 
		
		System.out.println(Arrays.toString(array));
	}

}
