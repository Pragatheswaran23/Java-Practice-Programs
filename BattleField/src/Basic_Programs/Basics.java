package Basic_Programs;

import java.util.Scanner;

public class Basics {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.print("Size : ");
	int[] ar = new int[s.nextInt()];
	
	for (int i=0;i<ar.length;i++) {
		
		ar[i] = s.nextInt();
		
	}
	
	for (int j=0 ; j<ar.length;j++) {
		System.out.println(ar[j]);
	}
	s.close();
}

}
