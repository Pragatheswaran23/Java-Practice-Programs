package Basic_program;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {67,3,56,45,1,2};
		
		for(int a = arr.length-1; a>=0; a--) {
			for(int b=0;b<a;b++) {
				if (arr[b] > arr[b+1]) {
					int tem = arr[b];
					arr[b] = arr[b+1];
					arr[b+1] = tem;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
