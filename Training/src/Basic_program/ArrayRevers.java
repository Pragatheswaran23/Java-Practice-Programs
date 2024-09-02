package Basic_program;

public class ArrayRevers {
	public static void main(String[] args) {
		int [] a = {40,60,70};
		demo(a);
		
	}
	public static void demo(int [] arr) {
		for (int i=(arr.length-1); i>=0 ;i--) {
			System.out.println(arr[i]);
		}
	}

}
