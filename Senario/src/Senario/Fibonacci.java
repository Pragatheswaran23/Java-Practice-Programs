package Senario;

public class Fibonacci {
	
	public static void main(String[] args) {
		int prev = 0;
		int cur = 1;
		int count = 2;
		int n = 6;
		System.out.print("0 " + "1");
		
		while (count < n) {
			int temp = cur;
			cur = prev + cur;
			prev = temp;
			count++;
			System.out.print(" " +cur);
			
		}
	}

}
