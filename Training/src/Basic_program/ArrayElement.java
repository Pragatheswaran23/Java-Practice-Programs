package Basic_program;
import java.util.*;

public class ArrayElement {
	
	public static void main(String[] args) {
		int[] ar = {123,456,789};
		
		System.out.print("Before:");
		System.out.println(Arrays.toString(ar));

		int i = 0;
		for (int a : ar) {
			int tem = 0;
			while (a != 0) {
				tem = (tem*10) + (a%10);
				a /= 10;
			}
			ar[i++] = tem;					
		}
		
		System.out.print("After:");
		
		System.out.println(Arrays.toString(ar));
		
	}

}
