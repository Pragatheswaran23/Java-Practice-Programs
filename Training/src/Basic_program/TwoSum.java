package Basic_program;

import java.util.Arrays;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int ar[] = {2,15,7,8,11};
		int target = 19;
		
		int res[] = new int[2];
		
		for (int i=0;i<ar.length;i++) {
			for(int j=i;j<ar.length;j++) {
				if (ar[i]+ar[j] == target) {
					res[0] = ar[i];
					res[1] = ar[j];
				}
			}
		}
		
		System.out.println(Arrays.toString(res));
	}

}
