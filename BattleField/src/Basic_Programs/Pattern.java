package Basic_Programs;

import java.util.Scanner;
public class Pattern {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of lines:");
		int n = sc.nextInt();
		System.out.println("\nInverted right angled triangle:\n");
		for (int i=1; i<=n; i++) {
			for (int j=n; j>0; j--) {
				System.out.print((i==1)?"* ":(j==n || i==j?"* ":"  "));
			}
			System.out.println("");
		}
		
		System.out.println("\nPrimary Diagonal:\n");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(i==j?"*":"  ");
			}
			System.out.println("");
		}
		
		System.out.println("\nSecondary Diagonal:\n");
		for (int i=1; i<=n; i++) {
			for (int j=n; j>=1; j--) {
				System.out.print(i==j?"*":"  ");
			}
			System.out.println("");
		}
		sc.close();
	}

}
