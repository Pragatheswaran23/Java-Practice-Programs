package Senario;

public class Strong {

	public static void main(String[] args) {
		int n = 111;
		
		int tem = n;
		int sum = 0;
		
		while (tem != 0) {
			int fat = 1;
			int di = tem%10;
			tem /= 10;
			if (di > 0) {
				for (int i = 1; i<=di; i++) {
					fat *= i;
				}
			}
			sum += fat;
		}
		
		if (sum == n) System.out.println(true);
		else System.out.println(false);
	}
}
