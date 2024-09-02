package Senario;

import java.util.Scanner;

public class EncriptionGame {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		String res = "";
		int tem = num;
		char [] ch = {' ', 'b', 'a', 'e', 'c', 'i', 'd', 'o', 'f', 'g'};
		while (tem > 0) {
			int di = tem % 10;
			tem /= 10;
			res = ch[di] + res;
		}
		System.out.println(res);
		sc.close();
	}

}
