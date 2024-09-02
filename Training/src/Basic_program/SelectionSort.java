package Basic_program;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] ar = {5,3,7,9,1};
		
		for (int i=0; i<ar.length-1; i++) {
			int ind = i;
			for (int j=i+1; j<ar.length; j++) {
				if (ar[ind]>ar[j]) {
					ind = j;
				}
			}
			int tem = ar[ind];
			ar[ind] = ar[i];
			ar[i] = tem;
		}
		System.out.println(Arrays.toString(ar));
	}
}
