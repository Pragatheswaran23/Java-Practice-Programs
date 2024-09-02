package Senario;

import java.util.Arrays;

public class AirportRisk {
	
	public static void main(String[] args) {
		int [] arr = {1,0,2,0,1,0,2};
		
		int count0 = 0;
		int count2 = 0;
		
		for (int a = 0 ;a < arr.length; a++) {
			if (arr[a] == 0) count0++;
			else if (arr[a] == 2)count2++;
			arr[a] = 1; 
		}
		
		for (int i=0; i<count0; i++) {
			arr[i] = 0;
		}
		for (int i = 1; i<=count2;i++) {
			arr[arr.length-i] = 2;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
