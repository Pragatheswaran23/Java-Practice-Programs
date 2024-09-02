package Basic_Programs;

import java.util.Scanner;

public class Coin {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int coinsCount = coin(s.nextInt());
		if (coinsCount != -1)
			System.out.println(coinsCount);
		else
			System.out.println("Not Possible");
		s.close();
	}
	
	static int coin(int n) {
		int c5 ;
		int c2 ;
		
		if (n >= 25 ) {
			c5 = 5;
			n -= 25;
		}else {
			c5 = n/5;
			n %= 5;
		}
		
		if (n >= 10) {
			c2 = 5;
			n -= 10;
		}else {
			c2 = n/2;
			n %= 2;
		}
		int res = c5 + c2 + n;
		
		if (res<15)
			return res;
		else
			return -1;
	}
}
