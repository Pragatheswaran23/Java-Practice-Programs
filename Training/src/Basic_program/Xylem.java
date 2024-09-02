package Basic_program;

import java.util.Scanner;

public class Xylem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = s.nextInt();
		if (num > 9) {
			int sum1 = num % 10;
			int tem = num/10;
			int sum2 = 0;
			int d = 0;
			while (tem > 0) {
				d = tem%10;
				sum2 += d;
				tem /= 10;
			}
			sum1 += d;
			sum2 -= d;
			
			if (sum1 == sum2) {
				System.out.println("Xylem");
			}else {
				System.out.println("Pholem");
			}
		}else {
			System.out.println("Pholem");
		}
		s.close();
	}

}
