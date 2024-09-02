package Basic_program;

import java.util.Arrays;

public class SortingArray2 {
	public static void main(String[] args) {
		int array[] = {1,0,0,1,0,1};

		int res[] = new int[array.length];
		
		int tem = array.length;                     //0 to 5... tem=5
		
		for (int i = 0; i<array.length; i++) {
			if (array[i] == 1) res[--tem] = 1;
		}
		
		System.out.println(Arrays.toString(res));
	}

}
