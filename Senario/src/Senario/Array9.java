package Senario;

public class Array9 {
	
	public static void main(String[] args) {
		
		int [] ar = {1,2,9,9};
		
		boolean res = false;
		
		if (ar[0] == 9 || ar[(ar.length-1)] == 9) {
			res = true;
		}
		
		System.out.println(res);
		
	}

}
