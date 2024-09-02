package Senario;

import java.util.Scanner;

public class MonkeyMoodAnalyzer {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("A : ");
		String aSmile = sc.nextLine();
		System.out.print("B : ");
		String bSmile = sc.nextLine();
		
		if (aSmile.equals(bSmile) && bSmile.equals(aSmile)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		sc.close();
	}

}
