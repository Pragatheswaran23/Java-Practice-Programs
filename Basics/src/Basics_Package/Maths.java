package Basics_Package;

import java.util.Scanner;

public class Maths {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Radius : ");
		int r = in.nextInt();
		System.out.print("Height : ");
		int h = in.nextInt();
		
		double VOC = volumeOfCylinder(r,h);
		System.out.println(VOC);
	}
	
	static double volumeOfCylinder(int radius, int height) {
		
		
		
	}

}
