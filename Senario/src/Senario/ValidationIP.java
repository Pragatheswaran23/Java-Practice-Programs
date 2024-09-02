package Senario;

import java.util.Scanner;

public class ValidationIP {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		String [] ar = str.split("[.]");
		int count=0;
		
		for (String i : ar) {
			int ip = Integer.parseInt(i);
			
			if (ip <= 200) {
				count++;
			}else {
				break;
			}
		}
		
		if (count == ar.length) System.out.println("Valid IP");
		else System.out.println("Not Valid IP");
		
		s.close();
	}

}
