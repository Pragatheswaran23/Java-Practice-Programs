package Senario;

import java.util.ArrayList;

public class UniqeDuplicate {
	
	public static void main(String[] args) {
		int [] arr = {1,2,2,1,3};
		
		ArrayList<Integer> uni = new ArrayList();
		ArrayList<Integer> dup = new ArrayList();
		
		for (int a : arr) {
			if (uni.contains(a)) {
				dup.add(a);
				uni.remove((Integer) a);
			}else{
				uni.add(a);
			}
		}
		
		uni.remove((Integer) 1);
		
		System.out.println("Unique : " + uni);
		System.out.println("Dupicate : " + dup);
	}

}
