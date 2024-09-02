package Basic_program;

public class Cube {
	/*static int cube_root(int n) {
		return n*n*n;
		
	}*/
	
	static int cube_root(int n) {
		int res=(int) Math.pow(n, 3);
		return res;
	}
	
	public static void main(String[] a) {
		int res= cube_root(5);
		System.out.println(res);
	}

}
