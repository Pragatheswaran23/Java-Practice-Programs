package Basics_Package;

import java.util.Scanner;


public class LeapYear {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Year : ");
		int year = in.nextInt();
		String res = (year % 4 == 0)?"leap year":"not a leap year";
		System.out.println("Given is a " + res);
		
		in.close();
	}

}
